import dk.aau.cs.d403.ast.AstBuilder;
import dk.aau.cs.d403.ast.structure.ProgramNode;
import dk.aau.cs.d403.parser.SpookLexer;
import dk.aau.cs.d403.parser.SpookParser;
import dk.aau.cs.d403.semantics.TypeChecking;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class FunctionDeclarationTest {

    private TypeChecking typeChecking = new TypeChecking();

    @AfterEach
    void printSymbolTable() {
        typeChecking.printSymbolTable();
    }

    // Testing function declarations.
    @Test
    void scopeRuleClassSetter01() {
        try {
            SpookLexer lexer = new SpookLexer(CharStreams.fromFileName("Resources/FunctionDeclarationTests/FunctionDeclaration01.spook"));
            SpookParser parser = new SpookParser(new CommonTokenStream(lexer));

            AstBuilder astBuilder = new AstBuilder();
            ProgramNode programNode = (ProgramNode) astBuilder.visitProgram(parser.program());

            typeChecking.visitProgram(programNode);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
