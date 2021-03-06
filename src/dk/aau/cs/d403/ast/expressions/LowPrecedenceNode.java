package dk.aau.cs.d403.ast.expressions;

import dk.aau.cs.d403.CompilerException;
import dk.aau.cs.d403.ast.ASTnode;
import dk.aau.cs.d403.ast.CodePosition;
import dk.aau.cs.d403.ast.Enums;

import java.util.ArrayList;

import static dk.aau.cs.d403.ast.Enums.operatorToString;

public class LowPrecedenceNode implements ASTnode {
    private ArrayList<HighPrecedenceNode> highPrecedenceNodes;
    private ArrayList<Enums.Operator> operators;

    //Low -> High


    public LowPrecedenceNode(ArrayList<HighPrecedenceNode> highPrecedenceNodes) {
        this.highPrecedenceNodes = highPrecedenceNodes;
    }

    //Low -> High (Operator High)*
    public LowPrecedenceNode(ArrayList<HighPrecedenceNode> highPrecedenceNodes, ArrayList<Enums.Operator> operators) {
        //Check for illegal operators
        if (!(operators.contains(Enums.Operator.ADD) || operators.contains(Enums.Operator.SUB))) {
            throw new CompilerException("MUL, DIV & MOD are not Low Precedence", getCodePosition());
        }
        this.highPrecedenceNodes = highPrecedenceNodes;
        this.operators = operators;
    }

    public ArrayList<HighPrecedenceNode> getHighPrecedenceNodes() {
        return highPrecedenceNodes;
    }

    public ArrayList<Enums.Operator> getOperators() {
        return operators;
    }

    @Override
    public String prettyPrint(int indent) {
        int matchHigh = 0;
        if (highPrecedenceNodes != null && operators != null) {
            if (!highPrecedenceNodes.isEmpty() && !operators.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (HighPrecedenceNode highPrecedenceNode : highPrecedenceNodes) {
                    //Get the highNode
                    sb.append(highPrecedenceNode.prettyPrint(indent));
                    //Get operator matching the highNode
                    if (matchHigh < highPrecedenceNodes.size() - 1) {
                        sb.append(operatorToString(operators.get(matchHigh)));
                        matchHigh++;
                    }
                }
                return sb.toString();
            } else
                return "LowPrecedenceNode receives empty list";
        }
        //Single HighNode
        else if (highPrecedenceNodes != null) {
            return highPrecedenceNodes.get(0).prettyPrint(indent);
        } else
            return "Invalid Low Precedence Operation";
    }

    private CodePosition codePosition;

    @Override
    public void setCodePosition(CodePosition codePosition) {
        this.codePosition = codePosition;
    }

    @Override
    public CodePosition getCodePosition() {
        return codePosition;
    }
}
