package dk.aau.cs.d403.ast.statements;

import dk.aau.cs.d403.ast.CodePosition;
import dk.aau.cs.d403.ast.expressions.BoolExpressionNode;
import dk.aau.cs.d403.ast.structure.BlockNode;

import java.util.ArrayList;

public class IfElseStatementNode extends StatementNode {
    private IfStatementNode ifStatementNode;
    private ArrayList<ElseIfStatementNode> elseIfStatementNodes;
    private ElseStatementNode elseStatementNode;

    public IfElseStatementNode(IfStatementNode ifStatementNode, ArrayList<ElseIfStatementNode> elseIfStatementNodes, ElseStatementNode elseStatementNode) {
        this.ifStatementNode = ifStatementNode;
        this.elseIfStatementNodes = elseIfStatementNodes;
        this.elseStatementNode = elseStatementNode;
    }

    public IfElseStatementNode(IfStatementNode ifStatementNode) {
        this.ifStatementNode = ifStatementNode;
    }

    public IfElseStatementNode(IfStatementNode ifStatementNode, ElseStatementNode elseStatementNode) {
        this.ifStatementNode = ifStatementNode;
        this.elseStatementNode = elseStatementNode;
    }

    public IfElseStatementNode(IfStatementNode ifStatementNode, ArrayList<ElseIfStatementNode> elseIfStatementNodes) {
        this.ifStatementNode = ifStatementNode;
        this.elseIfStatementNodes = elseIfStatementNodes;
    }

    public IfStatementNode getIfStatementNode() {
        return ifStatementNode;
    }

    public ArrayList<ElseIfStatementNode> getElseIfStatementNodes() {
        return elseIfStatementNodes;
    }

    public ElseStatementNode getElseStatementNode() {
        return elseStatementNode;
    }

    @Override
    public String prettyPrint(int indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(ifStatementNode.prettyPrint(indent));
        sb.append("\n");
        if (elseIfStatementNodes != null) {
            for (ElseIfStatementNode elseIfStatementNode : elseIfStatementNodes) {
                sb.append(elseIfStatementNode.prettyPrint(indent));
            }
        }
        if (elseStatementNode != null) {
            sb.append("\n");
            sb.append(elseStatementNode.prettyPrint(indent));
        }

        return sb.toString();
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
