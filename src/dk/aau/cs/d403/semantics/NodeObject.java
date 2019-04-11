package dk.aau.cs.d403.semantics;

import dk.aau.cs.d403.ast.Enums;
import dk.aau.cs.d403.ast.expressions.ExpressionNode;
import dk.aau.cs.d403.ast.expressions.ObjectArgumentNode;
import dk.aau.cs.d403.ast.statements.FunctionArgNode;

import java.util.ArrayList;

public class NodeObject {
    private Enums.DataType type;
    private Enums.ClassType classType;
    private Enums.ReturnType returnType;
    private String name;
    private String scopeLevel;
    private String attributes;
    private ArrayList<ObjectArgumentNode> objectArguments;
    private ArrayList<FunctionArgNode> functionArguments;
    private ExpressionNode expression;

    public NodeObject(Enums.DataType type, String name, String scopeLevel) {
        this.type = type;
        this.name = name;
        this.scopeLevel = scopeLevel;
        this.attributes = "Variable";
    }

    public NodeObject(Enums.ClassType type, String name, String scopeLevel, ArrayList<ObjectArgumentNode> objectArguments) {
        this.classType = type;
        this.name = name;
        this.scopeLevel = scopeLevel;
        this.objectArguments = objectArguments;

        StringBuilder sb = new StringBuilder();
        for(ObjectArgumentNode objectArg : objectArguments) {
             sb.append(objectArg.prettyPrint());
             sb.append(",");
        }
        this.attributes = sb.toString();
    }

    public NodeObject(Enums.DataType type, String name, String scopeLevel, ExpressionNode expression) {
        this.type = type;
        this.name = name;
        this.scopeLevel = scopeLevel;
        this.expression = expression;
        this.attributes = expression.prettyPrint();
    }

    public NodeObject(Enums.ReturnType returnType, String name, String scopeLevel, ArrayList<FunctionArgNode> functionArguments) {
        this.returnType = returnType;
        this.name = name;
        this.scopeLevel = scopeLevel;
        this.functionArguments = functionArguments;

        if(functionArguments != null) {
            StringBuilder sb = new StringBuilder();

            for(FunctionArgNode functionArg : functionArguments) {
                sb.append(functionArg.prettyPrint());
                sb.append(",");
            }
            this.attributes = sb.toString();
        }
        else
            this.attributes = "No arguments";

    }

    public NodeObject(String name, String scopeLevel) {
        this.name = name;
        this.scopeLevel = scopeLevel;
        this.attributes = "Class";
    }

    public Enums.DataType getType() {
        return type;
    }

    public Enums.ReturnType getReturnType() {
        return returnType;
    }

    public String getName() {
        return name;
    }

    public String getScopeLevel() {
        return scopeLevel;
    }

    public String getAttributes() {
        return attributes;
    }

    public Enums.ClassType getClassType() {
        return classType;
    }

    public ArrayList<ObjectArgumentNode> getObjectArguments() {
        return objectArguments;
    }

    public ArrayList<FunctionArgNode> getFunctionArguments() {
        return functionArguments;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return String.format("%5s, %12s, %10s, %13s, %12s, %8s", getType(), getClassType(), getReturnType(), getName(), getAttributes(), getScopeLevel());
    }
}
