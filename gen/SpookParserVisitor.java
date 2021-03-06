// Generated from C:/Users/Marcus-Laptop/Documents/GitHub/P4/src\SpookParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpookParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpookParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpookParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SpookParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SpookParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SpookParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SpookParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SpookParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SpookParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(SpookParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#objectDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDecl(SpookParser.ObjectDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SpookParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SpookParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#arithExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpression(SpookParser.ArithExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#vector2Expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector2Expression(SpookParser.Vector2ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#vector3Expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector3Expression(SpookParser.Vector3ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#vector4Expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector4Expression(SpookParser.Vector4ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(SpookParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#ternaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryOperator(SpookParser.TernaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#lowPrecedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowPrecedence(SpookParser.LowPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#highPrecedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighPrecedence(SpookParser.HighPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#atomPrecedence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomPrecedence(SpookParser.AtomPrecedenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#arithOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithOperand(SpookParser.ArithOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#mathFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathFunction(SpookParser.MathFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#boolOperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOperations(SpookParser.BoolOperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#boolOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOperation(SpookParser.BoolOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SpookParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#nonObjectFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonObjectFunctionCall(SpookParser.NonObjectFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#objectFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFunctionCall(SpookParser.ObjectFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#objectArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectArgs(SpookParser.ObjectArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#objectArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectArg(SpookParser.ObjectArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#colorFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorFunctionCall(SpookParser.ColorFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(SpookParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(SpookParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#iterativeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterativeStatement(SpookParser.IterativeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(SpookParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#forLoopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopExpression(SpookParser.ForLoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(SpookParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(SpookParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(SpookParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(SpookParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(SpookParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(SpookParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(SpookParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#realNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealNumber(SpookParser.RealNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#integerNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumber(SpookParser.IntegerNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#boolOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOperator(SpookParser.BoolOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SpookParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(SpookParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(SpookParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SpookParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#predefinedFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedFunctionName(SpookParser.PredefinedFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#colorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorName(SpookParser.ColorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#objectVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectVariableName(SpookParser.ObjectVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SpookParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(SpookParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpookParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(SpookParser.ClassNameContext ctx);
}