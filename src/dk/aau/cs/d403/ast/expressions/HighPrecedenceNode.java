package dk.aau.cs.d403.ast.expressions;

import dk.aau.cs.d403.CompilerException;
import dk.aau.cs.d403.ast.ASTnode;
import dk.aau.cs.d403.ast.CodePosition;
import dk.aau.cs.d403.ast.Enums;

import java.util.ArrayList;

import static dk.aau.cs.d403.ast.Enums.operatorToString;

public class HighPrecedenceNode implements ASTnode {
    private ArrayList<AtomPrecedenceNode> atomPrecedenceNodes;
    private ArrayList<Enums.Operator> operators;

    //High -> Atom


    public HighPrecedenceNode(ArrayList<AtomPrecedenceNode> atomPrecedenceNodes) {
        this.atomPrecedenceNodes = atomPrecedenceNodes;
    }

    //High -> Atom (Operator Atom)*
    public HighPrecedenceNode(ArrayList<AtomPrecedenceNode> atomPrecedenceNodes, ArrayList<Enums.Operator> operators) {
        //Check for low precedence operators
        if (operators.contains(Enums.Operator.ADD) || operators.contains(Enums.Operator.SUB)) {
            throw new CompilerException("ADD & SUB are not High Precedence", getCodePosition());
        }
        this.atomPrecedenceNodes = atomPrecedenceNodes;
        this.operators = operators;
    }

    public ArrayList<AtomPrecedenceNode> getAtomPrecedenceNodes() {
        return atomPrecedenceNodes;
    }

    public ArrayList<Enums.Operator> getOperators() {
        return operators;
    }

    @Override
    public String prettyPrint(int indent) {
        int matchAtom = 0;
        if (atomPrecedenceNodes != null && operators != null) {
            if (!atomPrecedenceNodes.isEmpty() && !operators.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (AtomPrecedenceNode atomPrecedenceNode : atomPrecedenceNodes) {
                    //Get the AtomNode
                    sb.append(atomPrecedenceNode.prettyPrint(indent));
                    //Get operator matching the AtomNode
                    if (matchAtom < atomPrecedenceNodes.size() - 1) {
                        sb.append(operatorToString(operators.get(matchAtom)));
                        matchAtom++;
                    }
                }
                return sb.toString();
            } else
                return "HighPrecedenceNode receives empty list";
        } else if (atomPrecedenceNodes != null && !atomPrecedenceNodes.isEmpty()) {
            return atomPrecedenceNodes.get(0).prettyPrint(indent);
        } else
            return "Invalid High Precedence Operation";
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
