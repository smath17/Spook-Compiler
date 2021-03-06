package dk.aau.cs.d403.codegen;

import dk.aau.cs.d403.CompilerException;
import dk.aau.cs.d403.ast.Enums;
import dk.aau.cs.d403.ast.expressions.*;
import dk.aau.cs.d403.ast.statements.*;
import dk.aau.cs.d403.ast.structure.*;
import dk.aau.cs.d403.spook.*;
import dk.aau.cs.d403.spook.color.Color;
import dk.aau.cs.d403.spook.shapes.*;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class CodeGenerator {

    private StringBuilder sb;
    private Scene scene;

    private HashMap<String, SpookObject> spookObjects;
    private HashSet<String> usedClasses;
    private HashMap<String, VariableDeclarationNode> variables;
    private LinkedHashSet<String> usedVariables;

    public String GenerateGLSL(ProgramNode ast) {
        sb = new StringBuilder();
        scene = new Scene();

        spookObjects = new HashMap<>();
        usedClasses = new HashSet<>();

        variables = new HashMap<>();
        usedVariables = new LinkedHashSet<>();

        ProgramNode program = visitProgram(ast);

        generateStructs();
        generatePrototypes();
        generateMain();
        generateFunctions();

        return sb.toString();
    }

    private void generateStructs() {
        for (String type : usedClasses) {
            sb.append(getClassCode(type, "getStruct"));
            sb.append("\n");
        }

        sb.append("\n");
    }

    private void generatePrototypes() {
        for (String type : usedClasses) {
            sb.append(getClassCode(type, "getCheckFunctionSignature"));
            sb.append(";\n");
        }

        sb.append("\n");
    }

    private void generateFunctions() {
        for (String type : usedClasses) {
            sb.append(getClassCode(type, "getCheckFunctionSignature"));
            sb.append("{\n\t");
            sb.append(getClassCode(type, "getCheckFunctionBody"));
            sb.append("\n}\n");
        }
    }

    private void generateMain() {
        sb.append("void mainImage( out vec4 fragColor, in vec2 fragCoord ) {\n");

        LinkedList<String> list = new LinkedList<>(usedVariables);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()) {
            String varDecl = itr.next();
            VariableDeclarationNode variableDeclarationNode = variables.get(varDecl);
            if (variableDeclarationNode != null) {
                sb.append("\t");
                sb.append(PrintGLSL.printVariableDeclaration(variableDeclarationNode));
                sb.append("\n\n");
            }
        }

        for (SpookObject object : scene.getChildren()) {
            sb.append("\t");
            sb.append(object.getDeclaration());
            sb.append("\n\n");
        }

        for (SpookObject object : scene.getChildren()) {
            sb.append("\t");
            sb.append(((Shape)object).getCheckCall());
            sb.append("\n\n");
        }

        sb.append("\tfragColor = vec4");
        sb.append(PrintGLSL.printVector4(scene.getColor()));
        sb.append(";\n");

        sb.append("}\n\n");
    }

    private ProgramNode visitProgram(ProgramNode programNode) {
        return new ProgramNode(visitMain(programNode.getMainNode()),programNode.getClassDeclarationNodes(), programNode.getFunctionDeclarationNodes());
    }

    private MainNode visitMain(MainNode mainNode) {
        return new MainNode(visitBlock(mainNode.getBlockNode()));
    }

    private BlockNode visitBlock(BlockNode blockNode) {
        ArrayList<StatementNode> statementNodes = new ArrayList<>();

        for (StatementNode statement : blockNode.getStatementNodes())
            statementNodes.addAll(visitStatement(statement));

        return new BlockNode(statementNodes);
    }

    private ArrayList<StatementNode> visitStatement(StatementNode statementNode) {
        ArrayList<StatementNode> statementNodes = new ArrayList<>();

        if (statementNode instanceof AssignmentNode)
            statementNodes.add(visitAssignment((AssignmentNode)statementNode));
        else if (statementNode instanceof DeclarationNode)
            statementNodes.add(visitDeclaration((DeclarationNode)statementNode));
        else if (statementNode instanceof IfElseStatementNode)
            statementNodes.add(visitIfElseStatement((IfElseStatementNode)statementNode));
        else if (statementNode instanceof ObjectFunctionCallNode)
            statementNodes.add(visitObjectFunctionCall((ObjectFunctionCallNode)statementNode));
        else if (statementNode instanceof ReturnNode)
            statementNodes.add(statementNode); //TODO: visitReturn((ReturnNode)statementNode);
        else if (statementNode instanceof ForLoopStatementNode)
            statementNodes.addAll(visitForLoopStatement((ForLoopStatementNode)statementNode));
        else {
            throw new RuntimeException("Statement is of unknown type: " + statementNode.prettyPrint(0));
        }

        return statementNodes;
    }

    private ArrayList<StatementNode> visitForLoopStatement(ForLoopStatementNode forLoopStatementNode) {
        ArrayList<StatementNode> statementNodes = new ArrayList<>();

        ForLoopExpressionNode expressionNode1 = visitForLoopExpressionNode(forLoopStatementNode.getForLoopExpressionNode1());
        ForLoopExpressionNode expressionNode2 = visitForLoopExpressionNode(forLoopStatementNode.getForLoopExpressionNode2());

        if (expressionNode1.getVariableDeclarationNode() != null) {
            statementNodes.add(expressionNode1.getVariableDeclarationNode());
        }
        else if (expressionNode1.getAssignmentNode() != null) {
            statementNodes.add(expressionNode1.getAssignmentNode());
        }

        if (forLoopStatementNode.getStatementNode() != null) {
            statementNodes.addAll(visitStatement(forLoopStatementNode.getStatementNode()));
        }
        else if (forLoopStatementNode.getBlockNode() != null) {
            statementNodes.addAll(visitBlock(forLoopStatementNode.getBlockNode()).getStatementNodes());
        }
        else
            throw new CompilerException("Invalid for loop", forLoopStatementNode.getCodePosition());

        return statementNodes;
    }

    private ForLoopExpressionNode visitForLoopExpressionNode(ForLoopExpressionNode forLoopExpressionNode) {
        if (forLoopExpressionNode.getAssignmentNode() != null)
            return new ForLoopExpressionNode(visitAssignment(forLoopExpressionNode.getAssignmentNode()));
        else if (forLoopExpressionNode.getRealNumberNode() != null)
            return new ForLoopExpressionNode(forLoopExpressionNode.getRealNumberNode());
        else if (forLoopExpressionNode.getVariableDeclarationNode() != null)
            return new ForLoopExpressionNode((VariableDeclarationNode)visitDeclaration(forLoopExpressionNode.getVariableDeclarationNode()));
        else if (forLoopExpressionNode.getVariableName() != null)
            return new ForLoopExpressionNode(forLoopExpressionNode.getVariableName());
        else
            return forLoopExpressionNode;
    }

    private IfElseStatementNode visitIfElseStatement(IfElseStatementNode ifElseStatementNode) {

        IfStatementNode ifStatementNode = visitIfStatementNode(ifElseStatementNode.getIfStatementNode());
        ElseStatementNode elseStatementNode = null;
        ArrayList<ElseIfStatementNode> elseIfStatementNodes = new ArrayList<>();

        if (ifElseStatementNode.getElseIfStatementNodes() != null) {
            for (ElseIfStatementNode elseIfStatementNode : ifElseStatementNode.getElseIfStatementNodes()) {
                elseIfStatementNodes.add(visitElseIfStatementNode(elseIfStatementNode));
            }
        }

        if (ifElseStatementNode.getElseStatementNode() != null) {
            elseStatementNode = visitElseStatementNode(ifElseStatementNode.getElseStatementNode());
        }

        if (elseIfStatementNodes != null) {
            if (elseStatementNode != null) {
                return new IfElseStatementNode(ifStatementNode, elseIfStatementNodes, elseStatementNode);
            }
            else
                return new IfElseStatementNode(ifStatementNode, elseIfStatementNodes);
        }
        else if (elseStatementNode != null) {
            return new IfElseStatementNode(ifStatementNode, elseStatementNode);
        }
        else
            return new IfElseStatementNode(ifStatementNode);
    }

    private IfStatementNode visitIfStatementNode(IfStatementNode ifStatementNode) {
        BoolExpressionNode boolExpressionNode = null;
        BlockNode blockNode;
        StatementNode statementNode;

        if (ifStatementNode.getIfBool() != null) {
            boolExpressionNode = visitBoolExpression(ifStatementNode.getIfBool());
        }

        if (ifStatementNode.getIfBlock() != null) {
            blockNode = visitBlock(ifStatementNode.getIfBlock());
            return new IfStatementNode(boolExpressionNode, blockNode);
        }
        else if (ifStatementNode.getIfStatement() != null){
            statementNode = visitStatement(ifStatementNode.getIfStatement()).get(0); //TODO fix get(0) in this function and the 2 next.
            return new IfStatementNode(boolExpressionNode, statementNode);
        }
        else
            throw new CompilerException("Invalid if-statement", ifStatementNode.getCodePosition());
    }

    private ElseStatementNode visitElseStatementNode(ElseStatementNode elseStatementNode) {
        BlockNode blockNode;
        StatementNode statementNode;

        if (elseStatementNode.getElseBlock() != null) {
            blockNode = visitBlock(elseStatementNode.getElseBlock());
            return new ElseStatementNode(blockNode);
        }
        else if (elseStatementNode.getElseStatement() != null) {
            statementNode = visitStatement(elseStatementNode.getElseStatement()).get(0);
            return new ElseStatementNode(statementNode);
        }
        else
            throw new CompilerException("Invalid else-statement", elseStatementNode.getCodePosition());
    }

    private ElseIfStatementNode visitElseIfStatementNode(ElseIfStatementNode elseIfStatementNode) {
        BoolExpressionNode boolExpressionNode = null;
        BlockNode blockNode;
        StatementNode statementNode;

        if (elseIfStatementNode.getElseIfBool() != null) {
            boolExpressionNode = visitBoolExpression(elseIfStatementNode.getElseIfBool());
        }

        if (elseIfStatementNode.getElseIfBlock() != null) {
            blockNode = visitBlock(elseIfStatementNode.getElseIfBlock());
            return new ElseIfStatementNode(boolExpressionNode, blockNode);
        }
        else if (elseIfStatementNode.getElseIfStatement() != null){
            statementNode = visitStatement(elseIfStatementNode.getElseIfStatement()).get(0); //TODO fix get(0) in this function and the 2 next.
            return new ElseIfStatementNode(boolExpressionNode, statementNode);
        }
        else
            throw new CompilerException("Invalid else-if-statement", elseIfStatementNode.getCodePosition());
    }


    private AssignmentNode visitAssignment(AssignmentNode assignmentNode) {
        ExpressionNode expressionNode = visitExpression(assignmentNode.getExpressionNode());

        if (assignmentNode.getVariableName() != null)
            return new AssignmentNode(assignmentNode.getVariableName(), expressionNode);
        else
            return new AssignmentNode(assignmentNode.getSwizzleNode(), expressionNode);
    }

    private ExpressionNode visitExpression(ExpressionNode expressionNode) {
        if (expressionNode instanceof ArithExpressionNode)
            return visitArithExpression((ArithExpressionNode)expressionNode);
        else if(expressionNode instanceof Vector2ExpressionNode) {
            ArithExpressionNode expr1 = (ArithExpressionNode)visitExpression(((Vector2ExpressionNode) expressionNode).getArithExpressionNode1());
            ArithExpressionNode expr2 = (ArithExpressionNode)visitExpression(((Vector2ExpressionNode) expressionNode).getArithExpressionNode2());
            if (expressionNode instanceof Vector3ExpressionNode) {
                ArithExpressionNode expr3 = (ArithExpressionNode)visitExpression(((Vector3ExpressionNode) expressionNode).getArithExpressionNode3());
                if (expressionNode instanceof Vector4ExpressionNode) {
                    ArithExpressionNode expr4 = (ArithExpressionNode)visitExpression(((Vector4ExpressionNode) expressionNode).getArithExpressionNode4());
                    return new Vector4ExpressionNode(expr1, expr2, expr3, expr4);
                }
                else
                    return new Vector3ExpressionNode(expr1, expr2, expr3);
            }
            else
                return new Vector2ExpressionNode(expr1, expr2);
        }
        else if (expressionNode instanceof BoolExpressionNode)
            return visitBoolExpression((BoolExpressionNode)expressionNode);
        else if (expressionNode instanceof TernaryOperatorNode) {
            return visitTernaryOperator((TernaryOperatorNode)expressionNode);
        }
        //TODO: if expressionNode is FunctionCall
        else {
            return expressionNode;
        }
    }

    private BoolExpressionNode visitBoolExpression(BoolExpressionNode boolExpressionNode) {
        return boolExpressionNode;
    }

    private TernaryOperatorNode visitTernaryOperator(TernaryOperatorNode ternaryOperatorNode) {
        return ternaryOperatorNode;
    }

    private ArithExpressionNode visitArithExpression(ArithExpressionNode arithExpressionNode) {
        return new ArithExpressionNode(visitLowPrecedence(arithExpressionNode.getLowPrecedenceNode()));
    }

    private LowPrecedenceNode visitLowPrecedence(LowPrecedenceNode lowPrecedenceNode) {
        ArrayList<HighPrecedenceNode> highPrecedenceNodes = new ArrayList<>();

        for (HighPrecedenceNode highPrecedenceNode : lowPrecedenceNode.getHighPrecedenceNodes()) {
            highPrecedenceNodes.add(visitHighPrecedence(highPrecedenceNode));
        }

        if (lowPrecedenceNode.getOperators() != null)
            return new LowPrecedenceNode(highPrecedenceNodes, lowPrecedenceNode.getOperators());
        else
            return new LowPrecedenceNode(highPrecedenceNodes);
    }

    private HighPrecedenceNode visitHighPrecedence(HighPrecedenceNode highPrecedenceNode) {
        ArrayList<AtomPrecedenceNode> atomPrecedenceNodes = new ArrayList<>();

        for (AtomPrecedenceNode atomPrecedenceNode: highPrecedenceNode.getAtomPrecedenceNodes()) {
            atomPrecedenceNodes.add(visitAtomPrecedence(atomPrecedenceNode));
        }

        if (highPrecedenceNode.getOperators() != null)
            return new HighPrecedenceNode(atomPrecedenceNodes, highPrecedenceNode.getOperators());
        else
            return new HighPrecedenceNode(atomPrecedenceNodes);
    }

    private AtomPrecedenceNode visitAtomPrecedence(AtomPrecedenceNode atomPrecedenceNode) {
        if (atomPrecedenceNode.getLowPrecedenceNode() != null)
            return new AtomPrecedenceNode(visitLowPrecedence(atomPrecedenceNode.getLowPrecedenceNode()));

        if (atomPrecedenceNode.getOperand() != null) {

            if (atomPrecedenceNode.getOperator() != null)
                return new AtomPrecedenceNode(atomPrecedenceNode.getOperator(), visitOperand(atomPrecedenceNode.getOperand()));
            else
                return new AtomPrecedenceNode(visitOperand(atomPrecedenceNode.getOperand()));
        }

        return atomPrecedenceNode;
    }

    private ArithOperandNode visitOperand(ArithOperandNode arithOperandNode) {
        String variableName = arithOperandNode.getVariableName();

        if (arithOperandNode.getNonObjectFunctionCallNode() != null)
            return new ArithOperandNode(visitNonObjectFunctionCall(arithOperandNode.getNonObjectFunctionCallNode()));
        else if (arithOperandNode.getObjectFunctionCallNode() != null)
            return new ArithOperandNode(visitObjectFunctionCall(arithOperandNode.getObjectFunctionCallNode()));
        else if (variableName != null) {
            switch (variableName) {
                case "Time":
                    return new ArithOperandNode("iTime");
                default:
                    usedVariables.add(variableName);

                    if (variables.get(variableName) != null) {
                        if (variables.get(variableName).getAssignmentNode() != null)
                            visitAssignment(variables.get(variableName).getAssignmentNode());
                    }

                    return arithOperandNode;
            }
        }
        else if (arithOperandNode.getSwizzleNode() != null) {
            return new ArithOperandNode(visitSwizzleNode(arithOperandNode.getSwizzleNode()));
        }
        else
            return arithOperandNode;
    }

    private SwizzleNode visitSwizzleNode(SwizzleNode swizzleNode) {
        String variableName;
        switch (swizzleNode.getVariableName()) {
            case "Screen":
                variableName = "iResolution";
                break;
            default:
                variableName = swizzleNode.getVariableName();
        }

        if (swizzleNode.getColorSwizzle() != null)
            return new SwizzleNode(variableName, swizzleNode.getColorSwizzle());
        else if (swizzleNode.getCoordinateSwizzle() != null)
            return new SwizzleNode(variableName, swizzleNode.getCoordinateSwizzle());
        else
            return swizzleNode;
    }

    private ObjectArgumentNode visitArgumentNode(ObjectArgumentNode argumentNode) {
        if (argumentNode.getLowPrecedence() != null)
            return new ObjectArgumentNode(visitLowPrecedence(argumentNode.getLowPrecedence()));
        else
            return argumentNode;
    }

    private DeclarationNode visitDeclaration(DeclarationNode declarationNode) {
        if (declarationNode instanceof VariableDeclarationNode) {

            VariableDeclarationNode variableDeclarationNode = (VariableDeclarationNode) declarationNode;
            VariableDeclarationNode visitedVariableDeclarationNode = visitVariableDeclaration(variableDeclarationNode);

            //Add variable declaration to HashMap
            variables.put(visitedVariableDeclarationNode.getVariableName(), visitedVariableDeclarationNode);

            return visitedVariableDeclarationNode;
        }
        else if (declarationNode instanceof ObjectDeclarationNode)
            return visitObjectDeclaration((ObjectDeclarationNode)declarationNode);
        else
            throw new RuntimeException("Declaration is of unknown type");
    }

    private VariableDeclarationNode visitVariableDeclaration(VariableDeclarationNode variableDeclarationNode) {
        Enums.DataType dataType = variableDeclarationNode.getDataType();
        String variableName = variableDeclarationNode.getVariableName();
        AssignmentNode assignmentNode = variableDeclarationNode.getAssignmentNode();

        if (assignmentNode != null)
            return new VariableDeclarationNode(dataType, visitAssignment(assignmentNode));
        return new VariableDeclarationNode(dataType, variableName);
    }

    private ObjectDeclarationNode visitObjectDeclaration(ObjectDeclarationNode objectDeclarationNode) {
        ArrayList<ObjectArgumentNode> argumentNodes = new ArrayList<>();

        for (ObjectArgumentNode argumentNode : objectDeclarationNode.getObjectArgumentNodes()) {
            argumentNodes.add(visitArgumentNode(argumentNode));
        }

        String objectType = objectDeclarationNode.getObjectType();
        usedClasses.add(objectType);

        String variableName = objectDeclarationNode.getVariableName();
        SpookObject object;

        switch (objectType) {
            case "Circle":
                object = new Circle(variableName, argumentNodes);
                break;
            case "Rectangle":
                object = new Rectangle(variableName, argumentNodes);
                break;
            case "Square":
                object = new Square(variableName, argumentNodes);
                break;
            case "Triangle":
                object = new Triangle(variableName, argumentNodes);
                break;
            default:
                throw new RuntimeException("Invalid object declaration");
        }

        spookObjects.put(variableName, object);

        if (argumentNodes.size() > 0)
            return new ObjectDeclarationNode(objectType, variableName, argumentNodes);
        else
            return new ObjectDeclarationNode(objectType, variableName);
    }

    private NonObjectFunctionCallNode visitNonObjectFunctionCall(NonObjectFunctionCallNode nonObjectFunctionCallNode) {
        ArrayList<ObjectArgumentNode> argumentNodes = new ArrayList<>();

        if (nonObjectFunctionCallNode.getArgumentNodes() != null) {
            for (ObjectArgumentNode argumentNode : nonObjectFunctionCallNode.getArgumentNodes()) {
                argumentNodes.add(visitArgumentNode(argumentNode));
            }
        }

        return new NonObjectFunctionCallNode(nonObjectFunctionCallNode.getFunctionName(), argumentNodes);
    }

    private ObjectFunctionCallNode visitObjectFunctionCall(ObjectFunctionCallNode objectFunctionCallNode) {
        String objectVariableName = objectFunctionCallNode.getObjectVariableName();
        String functionName = objectFunctionCallNode.getFunctionName();

        ArrayList<ObjectArgumentNode> argumentNodes = new ArrayList<>();

        if (objectFunctionCallNode.getObjectArguments() != null) {
            for (ObjectArgumentNode argumentNode : objectFunctionCallNode.getObjectArguments()) {
                argumentNodes.add(visitArgumentNode(argumentNode));
            }
        }

        switch (objectVariableName) {
            case "Scene":
                switch (functionName) {
                    case "add":
                        String objectName = argumentNodes.get(0)
                                .getLowPrecedence()
                                .getHighPrecedenceNodes().get(0)
                                .getAtomPrecedenceNodes().get(0)
                                .getOperand()
                                .getVariableName();
                        SpookObject object = spookObjects.get(objectName);
                        if (object != null)
                            scene.add(object);
                        break;
                    case "setColor":
                        scene.setColor(Color.getColorArgument(argumentNodes.get(0)));
                        break;
                    default:
                        throw new RuntimeException("Unknown function: " + functionName);
                }
                break;
            case "Color":
                //TODO: color
                break;
            default:
                SpookObject object = spookObjects.get(objectVariableName);

                if (object == null)
                    throw new RuntimeException("Object (" + objectVariableName + ") not found");

                switch (functionName) {
                    case "setPosition":
                        ObjectArgumentNode x = argumentNodes.get(0);
                        ObjectArgumentNode y = argumentNodes.get(1);
                        object.setPosition(new Vector2(x, y));
                        break;
                    case "add":
                        String objectName = argumentNodes.get(0)
                                .getLowPrecedence()
                                .getHighPrecedenceNodes().get(0)
                                .getAtomPrecedenceNodes().get(0)
                                .getOperand()
                                .getVariableName();
                        SpookObject childObject = spookObjects.get(objectName);
                        if (childObject != null)
                            object.add(childObject);
                        break;
                    default:
                        throw new RuntimeException("Unknown function: " + functionName + " on object: " + objectVariableName);
                }
        }

        if (argumentNodes.size() > 0)
            return new ObjectFunctionCallNode(objectVariableName, functionName, argumentNodes);
        else
            return new ObjectFunctionCallNode(objectVariableName, functionName);
    }

    private String getClassCode(String classType, String methodName) {
        java.lang.reflect.Method method;
        try {
            Class objClass = SpookObject.getClassFromClassType(classType);
            method = objClass.getMethod(methodName);
            try {
                return method.invoke(null).toString();
            }
            catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

        }
        catch (SecurityException | NoSuchMethodException e) {
            e.printStackTrace();
        }

        return classType + "." + methodName;
    }
}
