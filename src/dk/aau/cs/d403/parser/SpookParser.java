// Generated from C:/Users/Marcus-Laptop/Documents/GitHub/P4/src\SpookParser.g4 by ANTLR 4.7.2
package dk.aau.cs.d403.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SpookParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, BOOL=2, VECTOR2=3, VECTOR3=4, VECTOR4=5, VOID=6, MAIN=7, CLASS=8, 
		EXTENDS=9, IMPLEMENTS=10, RETURN=11, IF=12, ELSE_IF=13, ELSE=14, FOR=15, 
		TO=16, DIGIT=17, DIGIT_NEGATIVE=18, FLOAT_DIGIT=19, FLOAT_DIGIT_NEGATIVE=20, 
		BOOL_LITERAL=21, LEFT_BRACKET=22, RIGHT_BRACKET=23, LEFT_PAREN=24, RIGHT_PAREN=25, 
		DOT=26, COMMA=27, SEMICOLON=28, QUESTION=29, COLON=30, ASSIGN=31, ADD=32, 
		SUB=33, MOD=34, DIV=35, MUL=36, EQUAL=37, AND=38, OR=39, NOT_EQUAL=40, 
		NOT=41, GREATER_THAN=42, GREATER_OR_EQUAL=43, LESS_THAN=44, LESS_OR_EQUAL=45, 
		COORDINATE_SWIZZLE_MASK=46, COLOR_SWIZZLE_MASK=47, ID=48, COMMENT_STRING=49, 
		WS=50;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_block = 2, RULE_statement = 3, RULE_declaration = 4, 
		RULE_variableDecl = 5, RULE_objectDecl = 6, RULE_assignment = 7, RULE_expression = 8, 
		RULE_arithExpression = 9, RULE_vector2Expression = 10, RULE_vector3Expression = 11, 
		RULE_vector4Expression = 12, RULE_boolExpression = 13, RULE_ternaryOperator = 14, 
		RULE_arithOperand = 15, RULE_lowPrecedence = 16, RULE_highPrecedence = 17, 
		RULE_atomPrecedence = 18, RULE_highOperator = 19, RULE_lowOperator = 20, 
		RULE_boolOperations = 21, RULE_boolOperation = 22, RULE_boolOperationExtend = 23, 
		RULE_swizzle = 24, RULE_coordinateSwizzle = 25, RULE_colorSwizzle = 26, 
		RULE_functionCall = 27, RULE_nonObjectFunctionCall = 28, RULE_objectFunctionCall = 29, 
		RULE_objectArgs = 30, RULE_objectArg = 31, RULE_conditionalStatement = 32, 
		RULE_ifElseStatement = 33, RULE_ifStatement = 34, RULE_elseIfStatement = 35, 
		RULE_elseStatement = 36, RULE_ifBoolExpression = 37, RULE_elseifBoolExpression = 38, 
		RULE_ifBlock = 39, RULE_elseIfBlock = 40, RULE_elseBlock = 41, RULE_conditionalBlock = 42, 
		RULE_iterativeStatement = 43, RULE_forStatement = 44, RULE_forLoopExpression = 45, 
		RULE_classDecl = 46, RULE_classBlock = 47, RULE_constructor = 48, RULE_constructorBlock = 49, 
		RULE_functionDecl = 50, RULE_functionArgs = 51, RULE_functionArg = 52, 
		RULE_functionBlock = 53, RULE_returnStatement = 54, RULE_realNumber = 55, 
		RULE_integerNumber = 56, RULE_boolOperator = 57, RULE_returnType = 58, 
		RULE_dataType = 59, RULE_objectVariableName = 60, RULE_functionName = 61, 
		RULE_variableName = 62, RULE_className = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "block", "statement", "declaration", "variableDecl", 
			"objectDecl", "assignment", "expression", "arithExpression", "vector2Expression", 
			"vector3Expression", "vector4Expression", "boolExpression", "ternaryOperator", 
			"arithOperand", "lowPrecedence", "highPrecedence", "atomPrecedence", 
			"highOperator", "lowOperator", "boolOperations", "boolOperation", "boolOperationExtend", 
			"swizzle", "coordinateSwizzle", "colorSwizzle", "functionCall", "nonObjectFunctionCall", 
			"objectFunctionCall", "objectArgs", "objectArg", "conditionalStatement", 
			"ifElseStatement", "ifStatement", "elseIfStatement", "elseStatement", 
			"ifBoolExpression", "elseifBoolExpression", "ifBlock", "elseIfBlock", 
			"elseBlock", "conditionalBlock", "iterativeStatement", "forStatement", 
			"forLoopExpression", "classDecl", "classBlock", "constructor", "constructorBlock", 
			"functionDecl", "functionArgs", "functionArg", "functionBlock", "returnStatement", 
			"realNumber", "integerNumber", "boolOperator", "returnType", "dataType", 
			"objectVariableName", "functionName", "variableName", "className"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Num'", "'Bool'", "'Vec2'", "'Vec3'", "'Vec4'", "'Void'", "'Shader'", 
			"'Class'", "'extends'", "'implements'", "'return'", "'if'", "'else if'", 
			"'else'", "'for'", "'to'", null, null, null, null, null, "'{'", "'}'", 
			"'('", "')'", "'.'", "','", "';'", "'?'", "':'", "'='", "'+'", "'-'", 
			"'%'", "'/'", "'*'", "'=='", "'&&'", "'||'", "'!='", "'!'", "'>'", "'>='", 
			"'<'", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM", "BOOL", "VECTOR2", "VECTOR3", "VECTOR4", "VOID", "MAIN", 
			"CLASS", "EXTENDS", "IMPLEMENTS", "RETURN", "IF", "ELSE_IF", "ELSE", 
			"FOR", "TO", "DIGIT", "DIGIT_NEGATIVE", "FLOAT_DIGIT", "FLOAT_DIGIT_NEGATIVE", 
			"BOOL_LITERAL", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PAREN", "RIGHT_PAREN", 
			"DOT", "COMMA", "SEMICOLON", "QUESTION", "COLON", "ASSIGN", "ADD", "SUB", 
			"MOD", "DIV", "MUL", "EQUAL", "AND", "OR", "NOT_EQUAL", "NOT", "GREATER_THAN", 
			"GREATER_OR_EQUAL", "LESS_THAN", "LESS_OR_EQUAL", "COORDINATE_SWIZZLE_MASK", 
			"COLOR_SWIZZLE_MASK", "ID", "COMMENT_STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SpookParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpookParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			main();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << VECTOR2) | (1L << VECTOR3) | (1L << VECTOR4) | (1L << VOID) | (1L << CLASS) | (1L << ID))) != 0)) {
				{
				setState(132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(129);
					classDecl();
					}
					break;
				case 2:
					{
					setState(130);
					functionDecl();
					}
					break;
				case 3:
					{
					setState(131);
					variableName();
					}
					break;
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(SpookParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(MAIN);
			setState(138);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(SpookParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SpookParser.RIGHT_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LEFT_BRACKET);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << VECTOR2) | (1L << VECTOR3) | (1L << VECTOR4) | (1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				{
				setState(141);
				statement();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SpookParser.SEMICOLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public IterativeStatementContext iterativeStatement() {
			return getRuleContext(IterativeStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				assignment();
				setState(151);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				functionCall();
				setState(154);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				conditionalStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				iterativeStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SpookParser.SEMICOLON, 0); }
		public ObjectDeclContext objectDecl() {
			return getRuleContext(ObjectDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case BOOL:
			case VECTOR2:
			case VECTOR3:
			case VECTOR4:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				variableDecl();
				setState(162);
				match(SEMICOLON);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				objectDecl();
				setState(165);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpookParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpookParser.COMMA, i);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			dataType();
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(170);
				variableName();
				}
				break;
			case 2:
				{
				setState(171);
				assignment();
				}
				break;
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174);
				match(COMMA);
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(175);
					variableName();
					}
					break;
				case 2:
					{
					setState(176);
					assignment();
					}
					break;
				}
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectDeclContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ObjectVariableNameContext objectVariableName() {
			return getRuleContext(ObjectVariableNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SpookParser.ASSIGN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public ObjectArgsContext objectArgs() {
			return getRuleContext(ObjectArgsContext.class,0);
		}
		public ObjectDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterObjectDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitObjectDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitObjectDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclContext objectDecl() throws RecognitionException {
		ObjectDeclContext _localctx = new ObjectDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_objectDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			className();
			setState(185);
			objectVariableName();
			setState(186);
			match(ASSIGN);
			setState(187);
			match(LEFT_PAREN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << DIGIT_NEGATIVE) | (1L << FLOAT_DIGIT) | (1L << FLOAT_DIGIT_NEGATIVE) | (1L << LEFT_PAREN) | (1L << SUB) | (1L << ID))) != 0)) {
				{
				setState(188);
				objectArgs();
				}
			}

			setState(191);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SpookParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public SwizzleContext swizzle() {
			return getRuleContext(SwizzleContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(193);
				variableName();
				}
				break;
			case 2:
				{
				setState(194);
				swizzle();
				}
				break;
			}
			setState(197);
			match(ASSIGN);
			setState(198);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ArithExpressionContext arithExpression() {
			return getRuleContext(ArithExpressionContext.class,0);
		}
		public Vector2ExpressionContext vector2Expression() {
			return getRuleContext(Vector2ExpressionContext.class,0);
		}
		public Vector3ExpressionContext vector3Expression() {
			return getRuleContext(Vector3ExpressionContext.class,0);
		}
		public Vector4ExpressionContext vector4Expression() {
			return getRuleContext(Vector4ExpressionContext.class,0);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TernaryOperatorContext ternaryOperator() {
			return getRuleContext(TernaryOperatorContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				arithExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				vector2Expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				vector3Expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				vector4Expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				boolExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				ternaryOperator();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithExpressionContext extends ParserRuleContext {
		public LowPrecedenceContext lowPrecedence() {
			return getRuleContext(LowPrecedenceContext.class,0);
		}
		public ArithExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterArithExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitArithExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitArithExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExpressionContext arithExpression() throws RecognitionException {
		ArithExpressionContext _localctx = new ArithExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			lowPrecedence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector2ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public List<ArithExpressionContext> arithExpression() {
			return getRuleContexts(ArithExpressionContext.class);
		}
		public ArithExpressionContext arithExpression(int i) {
			return getRuleContext(ArithExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SpookParser.COMMA, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public Vector2ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector2Expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterVector2Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitVector2Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitVector2Expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector2ExpressionContext vector2Expression() throws RecognitionException {
		Vector2ExpressionContext _localctx = new Vector2ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vector2Expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(LEFT_PAREN);
			setState(212);
			arithExpression();
			setState(213);
			match(COMMA);
			setState(214);
			arithExpression();
			setState(215);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector3ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public List<ArithExpressionContext> arithExpression() {
			return getRuleContexts(ArithExpressionContext.class);
		}
		public ArithExpressionContext arithExpression(int i) {
			return getRuleContext(ArithExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpookParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpookParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public Vector3ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector3Expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterVector3Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitVector3Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitVector3Expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector3ExpressionContext vector3Expression() throws RecognitionException {
		Vector3ExpressionContext _localctx = new Vector3ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vector3Expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LEFT_PAREN);
			setState(218);
			arithExpression();
			setState(219);
			match(COMMA);
			setState(220);
			arithExpression();
			setState(221);
			match(COMMA);
			setState(222);
			arithExpression();
			setState(223);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector4ExpressionContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public List<ArithExpressionContext> arithExpression() {
			return getRuleContexts(ArithExpressionContext.class);
		}
		public ArithExpressionContext arithExpression(int i) {
			return getRuleContext(ArithExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SpookParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SpookParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public Vector4ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector4Expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterVector4Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitVector4Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitVector4Expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vector4ExpressionContext vector4Expression() throws RecognitionException {
		Vector4ExpressionContext _localctx = new Vector4ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_vector4Expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LEFT_PAREN);
			setState(226);
			arithExpression();
			setState(227);
			match(COMMA);
			setState(228);
			arithExpression();
			setState(229);
			match(COMMA);
			setState(230);
			arithExpression();
			setState(231);
			match(COMMA);
			setState(232);
			arithExpression();
			setState(233);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExpressionContext extends ParserRuleContext {
		public BoolOperationsContext boolOperations() {
			return getRuleContext(BoolOperationsContext.class,0);
		}
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			boolOperations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TernaryOperatorContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(SpookParser.QUESTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SpookParser.COLON, 0); }
		public TernaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterTernaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitTernaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitTernaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryOperatorContext ternaryOperator() throws RecognitionException {
		TernaryOperatorContext _localctx = new TernaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ternaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			boolExpression();
			setState(238);
			match(QUESTION);
			setState(239);
			expression();
			setState(240);
			match(COLON);
			setState(241);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithOperandContext extends ParserRuleContext {
		public RealNumberContext realNumber() {
			return getRuleContext(RealNumberContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SwizzleContext swizzle() {
			return getRuleContext(SwizzleContext.class,0);
		}
		public ArithOperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithOperand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterArithOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitArithOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitArithOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithOperandContext arithOperand() throws RecognitionException {
		ArithOperandContext _localctx = new ArithOperandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithOperand);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				realNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				swizzle();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowPrecedenceContext extends ParserRuleContext {
		public List<HighPrecedenceContext> highPrecedence() {
			return getRuleContexts(HighPrecedenceContext.class);
		}
		public HighPrecedenceContext highPrecedence(int i) {
			return getRuleContext(HighPrecedenceContext.class,i);
		}
		public List<LowOperatorContext> lowOperator() {
			return getRuleContexts(LowOperatorContext.class);
		}
		public LowOperatorContext lowOperator(int i) {
			return getRuleContext(LowOperatorContext.class,i);
		}
		public LowPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterLowPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitLowPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitLowPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowPrecedenceContext lowPrecedence() throws RecognitionException {
		LowPrecedenceContext _localctx = new LowPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lowPrecedence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			highPrecedence();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(250);
				lowOperator();
				setState(251);
				highPrecedence();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HighPrecedenceContext extends ParserRuleContext {
		public List<AtomPrecedenceContext> atomPrecedence() {
			return getRuleContexts(AtomPrecedenceContext.class);
		}
		public AtomPrecedenceContext atomPrecedence(int i) {
			return getRuleContext(AtomPrecedenceContext.class,i);
		}
		public List<HighOperatorContext> highOperator() {
			return getRuleContexts(HighOperatorContext.class);
		}
		public HighOperatorContext highOperator(int i) {
			return getRuleContext(HighOperatorContext.class,i);
		}
		public HighPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterHighPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitHighPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitHighPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HighPrecedenceContext highPrecedence() throws RecognitionException {
		HighPrecedenceContext _localctx = new HighPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_highPrecedence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			atomPrecedence();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << DIV) | (1L << MUL))) != 0)) {
				{
				{
				setState(259);
				highOperator();
				setState(260);
				atomPrecedence();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomPrecedenceContext extends ParserRuleContext {
		public ArithOperandContext arithOperand() {
			return getRuleContext(ArithOperandContext.class,0);
		}
		public TerminalNode SUB() { return getToken(SpookParser.SUB, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public LowPrecedenceContext lowPrecedence() {
			return getRuleContext(LowPrecedenceContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public AtomPrecedenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomPrecedence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterAtomPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitAtomPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitAtomPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomPrecedenceContext atomPrecedence() throws RecognitionException {
		AtomPrecedenceContext _localctx = new AtomPrecedenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atomPrecedence);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case DIGIT_NEGATIVE:
			case FLOAT_DIGIT:
			case FLOAT_DIGIT_NEGATIVE:
			case SUB:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(267);
					match(SUB);
					}
				}

				setState(270);
				arithOperand();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(LEFT_PAREN);
				setState(272);
				lowPrecedence();
				setState(273);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HighOperatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SpookParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SpookParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SpookParser.MOD, 0); }
		public HighOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_highOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterHighOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitHighOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitHighOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HighOperatorContext highOperator() throws RecognitionException {
		HighOperatorContext _localctx = new HighOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_highOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << DIV) | (1L << MUL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SpookParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SpookParser.SUB, 0); }
		public LowOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterLowOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitLowOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitLowOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowOperatorContext lowOperator() throws RecognitionException {
		LowOperatorContext _localctx = new LowOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lowOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOperationsContext extends ParserRuleContext {
		public BoolOperationContext boolOperation() {
			return getRuleContext(BoolOperationContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SpookParser.NOT, 0); }
		public List<BoolOperationExtendContext> boolOperationExtend() {
			return getRuleContexts(BoolOperationExtendContext.class);
		}
		public BoolOperationExtendContext boolOperationExtend(int i) {
			return getRuleContext(BoolOperationExtendContext.class,i);
		}
		public BoolOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterBoolOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitBoolOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitBoolOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOperationsContext boolOperations() throws RecognitionException {
		BoolOperationsContext _localctx = new BoolOperationsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_boolOperations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(281);
				match(NOT);
				}
			}

			setState(284);
			boolOperation();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << AND) | (1L << OR) | (1L << NOT_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_OR_EQUAL) | (1L << LESS_THAN) | (1L << LESS_OR_EQUAL))) != 0)) {
				{
				{
				setState(285);
				boolOperationExtend();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOperationContext extends ParserRuleContext {
		public TerminalNode BOOL_LITERAL() { return getToken(SpookParser.BOOL_LITERAL, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public BoolOperationsContext boolOperations() {
			return getRuleContext(BoolOperationsContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public RealNumberContext realNumber() {
			return getRuleContext(RealNumberContext.class,0);
		}
		public BoolOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterBoolOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitBoolOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitBoolOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOperationContext boolOperation() throws RecognitionException {
		BoolOperationContext _localctx = new BoolOperationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_boolOperation);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(BOOL_LITERAL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				variableName();
				}
				break;
			case LEFT_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(LEFT_PAREN);
				setState(294);
				boolOperations();
				setState(295);
				match(RIGHT_PAREN);
				}
				break;
			case DIGIT:
			case DIGIT_NEGATIVE:
			case FLOAT_DIGIT:
			case FLOAT_DIGIT_NEGATIVE:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				realNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOperationExtendContext extends ParserRuleContext {
		public BoolOperatorContext boolOperator() {
			return getRuleContext(BoolOperatorContext.class,0);
		}
		public BoolOperationContext boolOperation() {
			return getRuleContext(BoolOperationContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SpookParser.NOT, 0); }
		public BoolOperationExtendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperationExtend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterBoolOperationExtend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitBoolOperationExtend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitBoolOperationExtend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOperationExtendContext boolOperationExtend() throws RecognitionException {
		BoolOperationExtendContext _localctx = new BoolOperationExtendContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_boolOperationExtend);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			boolOperator();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(301);
				match(NOT);
				}
			}

			setState(304);
			boolOperation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwizzleContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SpookParser.DOT, 0); }
		public CoordinateSwizzleContext coordinateSwizzle() {
			return getRuleContext(CoordinateSwizzleContext.class,0);
		}
		public ColorSwizzleContext colorSwizzle() {
			return getRuleContext(ColorSwizzleContext.class,0);
		}
		public SwizzleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swizzle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterSwizzle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitSwizzle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitSwizzle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwizzleContext swizzle() throws RecognitionException {
		SwizzleContext _localctx = new SwizzleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_swizzle);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				variableName();
				setState(307);
				match(DOT);
				setState(308);
				coordinateSwizzle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				variableName();
				setState(311);
				match(DOT);
				setState(312);
				colorSwizzle();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoordinateSwizzleContext extends ParserRuleContext {
		public TerminalNode COORDINATE_SWIZZLE_MASK() { return getToken(SpookParser.COORDINATE_SWIZZLE_MASK, 0); }
		public CoordinateSwizzleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordinateSwizzle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterCoordinateSwizzle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitCoordinateSwizzle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitCoordinateSwizzle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordinateSwizzleContext coordinateSwizzle() throws RecognitionException {
		CoordinateSwizzleContext _localctx = new CoordinateSwizzleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_coordinateSwizzle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(COORDINATE_SWIZZLE_MASK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorSwizzleContext extends ParserRuleContext {
		public TerminalNode COLOR_SWIZZLE_MASK() { return getToken(SpookParser.COLOR_SWIZZLE_MASK, 0); }
		public ColorSwizzleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorSwizzle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterColorSwizzle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitColorSwizzle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitColorSwizzle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorSwizzleContext colorSwizzle() throws RecognitionException {
		ColorSwizzleContext _localctx = new ColorSwizzleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_colorSwizzle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(COLOR_SWIZZLE_MASK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public NonObjectFunctionCallContext nonObjectFunctionCall() {
			return getRuleContext(NonObjectFunctionCallContext.class,0);
		}
		public ObjectFunctionCallContext objectFunctionCall() {
			return getRuleContext(ObjectFunctionCallContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionCall);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				nonObjectFunctionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				objectFunctionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonObjectFunctionCallContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public ObjectArgsContext objectArgs() {
			return getRuleContext(ObjectArgsContext.class,0);
		}
		public NonObjectFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonObjectFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterNonObjectFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitNonObjectFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitNonObjectFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonObjectFunctionCallContext nonObjectFunctionCall() throws RecognitionException {
		NonObjectFunctionCallContext _localctx = new NonObjectFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nonObjectFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			functionName();
			setState(325);
			match(LEFT_PAREN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << DIGIT_NEGATIVE) | (1L << FLOAT_DIGIT) | (1L << FLOAT_DIGIT_NEGATIVE) | (1L << LEFT_PAREN) | (1L << SUB) | (1L << ID))) != 0)) {
				{
				setState(326);
				objectArgs();
				}
			}

			setState(329);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectFunctionCallContext extends ParserRuleContext {
		public ObjectVariableNameContext objectVariableName() {
			return getRuleContext(ObjectVariableNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SpookParser.DOT, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public ObjectArgsContext objectArgs() {
			return getRuleContext(ObjectArgsContext.class,0);
		}
		public ObjectFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterObjectFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitObjectFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitObjectFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectFunctionCallContext objectFunctionCall() throws RecognitionException {
		ObjectFunctionCallContext _localctx = new ObjectFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			objectVariableName();
			setState(332);
			match(DOT);
			setState(333);
			functionName();
			setState(334);
			match(LEFT_PAREN);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << DIGIT_NEGATIVE) | (1L << FLOAT_DIGIT) | (1L << FLOAT_DIGIT_NEGATIVE) | (1L << LEFT_PAREN) | (1L << SUB) | (1L << ID))) != 0)) {
				{
				setState(335);
				objectArgs();
				}
			}

			setState(338);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectArgsContext extends ParserRuleContext {
		public ObjectArgContext objectArg() {
			return getRuleContext(ObjectArgContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SpookParser.COMMA, 0); }
		public ObjectArgsContext objectArgs() {
			return getRuleContext(ObjectArgsContext.class,0);
		}
		public ObjectArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterObjectArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitObjectArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitObjectArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectArgsContext objectArgs() throws RecognitionException {
		ObjectArgsContext _localctx = new ObjectArgsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectArgs);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				objectArg();
				setState(341);
				match(COMMA);
				setState(342);
				objectArgs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				objectArg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectArgContext extends ParserRuleContext {
		public LowPrecedenceContext lowPrecedence() {
			return getRuleContext(LowPrecedenceContext.class,0);
		}
		public ObjectArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterObjectArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitObjectArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitObjectArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectArgContext objectArg() throws RecognitionException {
		ObjectArgContext _localctx = new ObjectArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_objectArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			lowPrecedence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionalStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			ifElseStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfElseStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifElseStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			ifStatement();
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(352);
					elseIfStatement();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(358);
				elseStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SpookParser.IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public IfBoolExpressionContext ifBoolExpression() {
			return getRuleContext(IfBoolExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(IF);
			setState(362);
			match(LEFT_PAREN);
			setState(363);
			ifBoolExpression();
			setState(364);
			match(RIGHT_PAREN);
			setState(365);
			ifBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(SpookParser.ELSE_IF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public ElseifBoolExpressionContext elseifBoolExpression() {
			return getRuleContext(ElseifBoolExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public ElseIfBlockContext elseIfBlock() {
			return getRuleContext(ElseIfBlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ELSE_IF);
			setState(368);
			match(LEFT_PAREN);
			setState(369);
			elseifBoolExpression();
			setState(370);
			match(RIGHT_PAREN);
			setState(371);
			elseIfBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SpookParser.ELSE, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ELSE);
			setState(374);
			elseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBoolExpressionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public IfBoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBoolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterIfBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitIfBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitIfBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBoolExpressionContext ifBoolExpression() throws RecognitionException {
		IfBoolExpressionContext _localctx = new IfBoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ifBoolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			boolExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseifBoolExpressionContext extends ParserRuleContext {
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ElseifBoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifBoolExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterElseifBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitElseifBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitElseifBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifBoolExpressionContext elseifBoolExpression() throws RecognitionException {
		ElseifBoolExpressionContext _localctx = new ElseifBoolExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_elseifBoolExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			boolExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			conditionalBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfBlockContext extends ParserRuleContext {
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterElseIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitElseIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitElseIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			conditionalBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public ConditionalBlockContext conditionalBlock() {
			return getRuleContext(ConditionalBlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			conditionalBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterConditionalBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitConditionalBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitConditionalBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalBlockContext conditionalBlock() throws RecognitionException {
		ConditionalBlockContext _localctx = new ConditionalBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditionalBlock);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				block();
				}
				break;
			case NUM:
			case BOOL:
			case VECTOR2:
			case VECTOR3:
			case VECTOR4:
			case RETURN:
			case IF:
			case FOR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterativeStatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public IterativeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterIterativeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitIterativeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitIterativeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterativeStatementContext iterativeStatement() throws RecognitionException {
		IterativeStatementContext _localctx = new IterativeStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_iterativeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			forStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SpookParser.FOR, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public List<ForLoopExpressionContext> forLoopExpression() {
			return getRuleContexts(ForLoopExpressionContext.class);
		}
		public ForLoopExpressionContext forLoopExpression(int i) {
			return getRuleContext(ForLoopExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(SpookParser.TO, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(FOR);
			setState(393);
			match(LEFT_PAREN);
			setState(394);
			forLoopExpression();
			setState(395);
			match(TO);
			setState(396);
			forLoopExpression();
			setState(397);
			match(RIGHT_PAREN);
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				{
				setState(398);
				block();
				}
				break;
			case NUM:
			case BOOL:
			case VECTOR2:
			case VECTOR3:
			case VECTOR4:
			case RETURN:
			case IF:
			case FOR:
			case ID:
				{
				setState(399);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopExpressionContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(SpookParser.DIGIT, 0); }
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForLoopExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterForLoopExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitForLoopExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitForLoopExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopExpressionContext forLoopExpression() throws RecognitionException {
		ForLoopExpressionContext _localctx = new ForLoopExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forLoopExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(402);
				match(DIGIT);
				}
				break;
			case 2:
				{
				setState(403);
				variableDecl();
				}
				break;
			case 3:
				{
				setState(404);
				variableName();
				}
				break;
			case 4:
				{
				setState(405);
				assignment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SpookParser.CLASS, 0); }
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(SpookParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(SpookParser.IMPLEMENTS, 0); }
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(CLASS);
			setState(409);
			className();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==IMPLEMENTS) {
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==EXTENDS || _la==IMPLEMENTS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				className();
				}
			}

			setState(414);
			classBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(SpookParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SpookParser.RIGHT_BRACKET, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitClassBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LEFT_BRACKET);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << VECTOR2) | (1L << VECTOR3) | (1L << VECTOR4) | (1L << VOID) | (1L << ID))) != 0)) {
				{
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(417);
					declaration();
					}
					break;
				case 2:
					{
					setState(418);
					constructor();
					}
					break;
				case 3:
					{
					setState(419);
					functionDecl();
					}
					break;
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public ConstructorBlockContext constructorBlock() {
			return getRuleContext(ConstructorBlockContext.class,0);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			className();
			setState(428);
			match(LEFT_PAREN);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << VECTOR2) | (1L << VECTOR3) | (1L << VECTOR4) | (1L << ID))) != 0)) {
				{
				setState(429);
				functionArgs();
				}
			}

			setState(432);
			match(RIGHT_PAREN);
			setState(433);
			constructorBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(SpookParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SpookParser.RIGHT_BRACKET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SpookParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SpookParser.SEMICOLON, i);
		}
		public ConstructorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterConstructorBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitConstructorBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitConstructorBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBlockContext constructorBlock() throws RecognitionException {
		ConstructorBlockContext _localctx = new ConstructorBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructorBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(LEFT_BRACKET);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(436);
				assignment();
				setState(437);
				match(SEMICOLON);
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(SpookParser.VOID, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SpookParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SpookParser.RIGHT_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionDecl);
		int _la;
		try {
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(VOID);
				setState(447);
				functionName();
				setState(448);
				match(LEFT_PAREN);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << VECTOR2) | (1L << VECTOR3) | (1L << VECTOR4) | (1L << ID))) != 0)) {
					{
					setState(449);
					functionArgs();
					}
				}

				setState(452);
				match(RIGHT_PAREN);
				setState(453);
				block();
				}
				break;
			case NUM:
			case BOOL:
			case VECTOR2:
			case VECTOR3:
			case VECTOR4:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				returnType();
				setState(456);
				functionName();
				setState(457);
				match(LEFT_PAREN);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << VECTOR2) | (1L << VECTOR3) | (1L << VECTOR4) | (1L << ID))) != 0)) {
					{
					setState(458);
					functionArgs();
					}
				}

				setState(461);
				match(RIGHT_PAREN);
				setState(462);
				functionBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgsContext extends ParserRuleContext {
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SpookParser.COMMA, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitFunctionArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitFunctionArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_functionArgs);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				functionArg();
				setState(467);
				match(COMMA);
				setState(468);
				functionArgs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				functionArg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitFunctionArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitFunctionArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case BOOL:
			case VECTOR2:
			case VECTOR3:
			case VECTOR4:
				{
				setState(473);
				dataType();
				}
				break;
			case ID:
				{
				setState(474);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(477);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(SpookParser.LEFT_BRACKET, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(SpookParser.RIGHT_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitFunctionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitFunctionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(LEFT_BRACKET);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					statement();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(486);
			returnStatement();
			setState(487);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SpookParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SpookParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(RETURN);
			setState(490);
			expression();
			setState(491);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealNumberContext extends ParserRuleContext {
		public IntegerNumberContext integerNumber() {
			return getRuleContext(IntegerNumberContext.class,0);
		}
		public TerminalNode FLOAT_DIGIT() { return getToken(SpookParser.FLOAT_DIGIT, 0); }
		public TerminalNode FLOAT_DIGIT_NEGATIVE() { return getToken(SpookParser.FLOAT_DIGIT_NEGATIVE, 0); }
		public RealNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterRealNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitRealNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitRealNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealNumberContext realNumber() throws RecognitionException {
		RealNumberContext _localctx = new RealNumberContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_realNumber);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case DIGIT_NEGATIVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				integerNumber();
				}
				break;
			case FLOAT_DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(FLOAT_DIGIT);
				}
				break;
			case FLOAT_DIGIT_NEGATIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(FLOAT_DIGIT_NEGATIVE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerNumberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(SpookParser.DIGIT, 0); }
		public TerminalNode DIGIT_NEGATIVE() { return getToken(SpookParser.DIGIT_NEGATIVE, 0); }
		public IntegerNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterIntegerNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitIntegerNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitIntegerNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerNumberContext integerNumber() throws RecognitionException {
		IntegerNumberContext _localctx = new IntegerNumberContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_integerNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==DIGIT_NEGATIVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SpookParser.EQUAL, 0); }
		public TerminalNode OR() { return getToken(SpookParser.OR, 0); }
		public TerminalNode AND() { return getToken(SpookParser.AND, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SpookParser.NOT_EQUAL, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SpookParser.GREATER_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL() { return getToken(SpookParser.GREATER_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(SpookParser.LESS_THAN, 0); }
		public TerminalNode LESS_OR_EQUAL() { return getToken(SpookParser.LESS_OR_EQUAL, 0); }
		public BoolOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterBoolOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitBoolOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitBoolOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOperatorContext boolOperator() throws RecognitionException {
		BoolOperatorContext _localctx = new BoolOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_boolOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << AND) | (1L << OR) | (1L << NOT_EQUAL) | (1L << GREATER_THAN) | (1L << GREATER_OR_EQUAL) | (1L << LESS_THAN) | (1L << LESS_OR_EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_returnType);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case BOOL:
			case VECTOR2:
			case VECTOR3:
			case VECTOR4:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				dataType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				className();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SpookParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(SpookParser.BOOL, 0); }
		public TerminalNode VECTOR2() { return getToken(SpookParser.VECTOR2, 0); }
		public TerminalNode VECTOR3() { return getToken(SpookParser.VECTOR3, 0); }
		public TerminalNode VECTOR4() { return getToken(SpookParser.VECTOR4, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << BOOL) | (1L << VECTOR2) | (1L << VECTOR3) | (1L << VECTOR4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectVariableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpookParser.ID, 0); }
		public ObjectVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterObjectVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitObjectVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitObjectVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectVariableNameContext objectVariableName() throws RecognitionException {
		ObjectVariableNameContext _localctx = new ObjectVariableNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_objectVariableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpookParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpookParser.ID, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpookParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpookParserListener ) ((SpookParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpookParserVisitor ) return ((SpookParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0207\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\7\2\u0087\n\2\f\2\16\2\u008a"+
		"\13\2\3\3\3\3\3\3\3\4\3\4\7\4\u0091\n\4\f\4\16\4\u0094\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a2\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00aa\n\6\3\7\3\7\3\7\5\7\u00af\n\7\3\7\3\7\3\7\5\7\u00b4\n"+
		"\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u00c0\n\b"+
		"\3\b\3\b\3\t\3\t\5\t\u00c6\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00d2\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00fa\n\21\3\22"+
		"\3\22\3\22\3\22\7\22\u0100\n\22\f\22\16\22\u0103\13\22\3\23\3\23\3\23"+
		"\3\23\7\23\u0109\n\23\f\23\16\23\u010c\13\23\3\24\5\24\u010f\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0116\n\24\3\25\3\25\3\26\3\26\3\27\5\27\u011d"+
		"\n\27\3\27\3\27\7\27\u0121\n\27\f\27\16\27\u0124\13\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u012d\n\30\3\31\3\31\5\31\u0131\n\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u013d\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\5\35\u0145\n\35\3\36\3\36\3\36\5\36\u014a\n\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\5\37\u0153\n\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \5 \u015c\n \3!\3!\3\"\3\"\3#\3#\7#\u0164\n#\f#\16#\u0167\13#\3#\5"+
		"#\u016a\n#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3,\3,\5,\u0187\n,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5."+
		"\u0193\n.\3/\3/\3/\3/\5/\u0199\n/\3\60\3\60\3\60\3\60\5\60\u019f\n\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u01a7\n\61\f\61\16\61\u01aa\13\61"+
		"\3\61\3\61\3\62\3\62\3\62\5\62\u01b1\n\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\7\63\u01ba\n\63\f\63\16\63\u01bd\13\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\5\64\u01c5\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01ce\n"+
		"\64\3\64\3\64\3\64\5\64\u01d3\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u01da"+
		"\n\65\3\66\3\66\5\66\u01de\n\66\3\66\3\66\3\67\3\67\7\67\u01e4\n\67\f"+
		"\67\16\67\u01e7\13\67\3\67\3\67\3\67\38\38\38\38\39\39\39\59\u01f3\n9"+
		"\3:\3:\3;\3;\3<\3<\5<\u01fb\n<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\2\2B\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\2\b\3\2$&\3\2\"#\3\2\13\f\3\2\23\24\4"+
		"\2\'*,/\3\2\3\7\2\u0203\2\u0082\3\2\2\2\4\u008b\3\2\2\2\6\u008e\3\2\2"+
		"\2\b\u00a1\3\2\2\2\n\u00a9\3\2\2\2\f\u00ab\3\2\2\2\16\u00ba\3\2\2\2\20"+
		"\u00c5\3\2\2\2\22\u00d1\3\2\2\2\24\u00d3\3\2\2\2\26\u00d5\3\2\2\2\30\u00db"+
		"\3\2\2\2\32\u00e3\3\2\2\2\34\u00ed\3\2\2\2\36\u00ef\3\2\2\2 \u00f9\3\2"+
		"\2\2\"\u00fb\3\2\2\2$\u0104\3\2\2\2&\u0115\3\2\2\2(\u0117\3\2\2\2*\u0119"+
		"\3\2\2\2,\u011c\3\2\2\2.\u012c\3\2\2\2\60\u012e\3\2\2\2\62\u013c\3\2\2"+
		"\2\64\u013e\3\2\2\2\66\u0140\3\2\2\28\u0144\3\2\2\2:\u0146\3\2\2\2<\u014d"+
		"\3\2\2\2>\u015b\3\2\2\2@\u015d\3\2\2\2B\u015f\3\2\2\2D\u0161\3\2\2\2F"+
		"\u016b\3\2\2\2H\u0171\3\2\2\2J\u0177\3\2\2\2L\u017a\3\2\2\2N\u017c\3\2"+
		"\2\2P\u017e\3\2\2\2R\u0180\3\2\2\2T\u0182\3\2\2\2V\u0186\3\2\2\2X\u0188"+
		"\3\2\2\2Z\u018a\3\2\2\2\\\u0198\3\2\2\2^\u019a\3\2\2\2`\u01a2\3\2\2\2"+
		"b\u01ad\3\2\2\2d\u01b5\3\2\2\2f\u01d2\3\2\2\2h\u01d9\3\2\2\2j\u01dd\3"+
		"\2\2\2l\u01e1\3\2\2\2n\u01eb\3\2\2\2p\u01f2\3\2\2\2r\u01f4\3\2\2\2t\u01f6"+
		"\3\2\2\2v\u01fa\3\2\2\2x\u01fc\3\2\2\2z\u01fe\3\2\2\2|\u0200\3\2\2\2~"+
		"\u0202\3\2\2\2\u0080\u0204\3\2\2\2\u0082\u0088\5\4\3\2\u0083\u0087\5^"+
		"\60\2\u0084\u0087\5f\64\2\u0085\u0087\5~@\2\u0086\u0083\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\3\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c"+
		"\7\t\2\2\u008c\u008d\5\6\4\2\u008d\5\3\2\2\2\u008e\u0092\7\30\2\2\u008f"+
		"\u0091\5\b\5\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\7\31\2\2\u0096\7\3\2\2\2\u0097\u00a2\5\n\6\2\u0098\u0099\5\20\t"+
		"\2\u0099\u009a\7\36\2\2\u009a\u00a2\3\2\2\2\u009b\u009c\58\35\2\u009c"+
		"\u009d\7\36\2\2\u009d\u00a2\3\2\2\2\u009e\u00a2\5B\"\2\u009f\u00a2\5X"+
		"-\2\u00a0\u00a2\5n8\2\u00a1\u0097\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u009b"+
		"\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\t\3\2\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\36\2\2\u00a5\u00aa\3\2\2"+
		"\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\7\36\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\13\3\2\2\2\u00ab\u00ae\5x=\2"+
		"\u00ac\u00af\5~@\2\u00ad\u00af\5\20\t\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b7\3\2\2\2\u00b0\u00b3\7\35\2\2\u00b1\u00b4\5~@\2\u00b2"+
		"\u00b4\5\20\t\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5\u0080"+
		"A\2\u00bb\u00bc\5z>\2\u00bc\u00bd\7!\2\2\u00bd\u00bf\7\32\2\2\u00be\u00c0"+
		"\5> \2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\7\33\2\2\u00c2\17\3\2\2\2\u00c3\u00c6\5~@\2\u00c4\u00c6\5\62\32"+
		"\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\7!\2\2\u00c8\u00c9\5\22\n\2\u00c9\21\3\2\2\2\u00ca\u00d2\5\24\13\2\u00cb"+
		"\u00d2\5\26\f\2\u00cc\u00d2\5\30\r\2\u00cd\u00d2\5\32\16\2\u00ce\u00d2"+
		"\5\34\17\2\u00cf\u00d2\5\36\20\2\u00d0\u00d2\58\35\2\u00d1\u00ca\3\2\2"+
		"\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\23\3\2\2\2\u00d3"+
		"\u00d4\5\"\22\2\u00d4\25\3\2\2\2\u00d5\u00d6\7\32\2\2\u00d6\u00d7\5\24"+
		"\13\2\u00d7\u00d8\7\35\2\2\u00d8\u00d9\5\24\13\2\u00d9\u00da\7\33\2\2"+
		"\u00da\27\3\2\2\2\u00db\u00dc\7\32\2\2\u00dc\u00dd\5\24\13\2\u00dd\u00de"+
		"\7\35\2\2\u00de\u00df\5\24\13\2\u00df\u00e0\7\35\2\2\u00e0\u00e1\5\24"+
		"\13\2\u00e1\u00e2\7\33\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\7\32\2\2\u00e4"+
		"\u00e5\5\24\13\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\5\24\13\2\u00e7\u00e8"+
		"\7\35\2\2\u00e8\u00e9\5\24\13\2\u00e9\u00ea\7\35\2\2\u00ea\u00eb\5\24"+
		"\13\2\u00eb\u00ec\7\33\2\2\u00ec\33\3\2\2\2\u00ed\u00ee\5,\27\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2\5\22"+
		"\n\2\u00f2\u00f3\7 \2\2\u00f3\u00f4\5\22\n\2\u00f4\37\3\2\2\2\u00f5\u00fa"+
		"\5p9\2\u00f6\u00fa\5~@\2\u00f7\u00fa\58\35\2\u00f8\u00fa\5\62\32\2\u00f9"+
		"\u00f5\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00fa!\3\2\2\2\u00fb\u0101\5$\23\2\u00fc\u00fd\5*\26\2\u00fd\u00fe"+
		"\5$\23\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102#\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0104\u010a\5&\24\2\u0105\u0106\5(\25\2\u0106\u0107\5&\24\2\u0107\u0109"+
		"\3\2\2\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b%\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\7#\2\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0116\5 "+
		"\21\2\u0111\u0112\7\32\2\2\u0112\u0113\5\"\22\2\u0113\u0114\7\33\2\2\u0114"+
		"\u0116\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u0111\3\2\2\2\u0116\'\3\2\2\2"+
		"\u0117\u0118\t\2\2\2\u0118)\3\2\2\2\u0119\u011a\t\3\2\2\u011a+\3\2\2\2"+
		"\u011b\u011d\7+\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0122\5.\30\2\u011f\u0121\5\60\31\2\u0120\u011f\3\2\2\2"+
		"\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123-\3"+
		"\2\2\2\u0124\u0122\3\2\2\2\u0125\u012d\7\27\2\2\u0126\u012d\5~@\2\u0127"+
		"\u0128\7\32\2\2\u0128\u0129\5,\27\2\u0129\u012a\7\33\2\2\u012a\u012d\3"+
		"\2\2\2\u012b\u012d\5p9\2\u012c\u0125\3\2\2\2\u012c\u0126\3\2\2\2\u012c"+
		"\u0127\3\2\2\2\u012c\u012b\3\2\2\2\u012d/\3\2\2\2\u012e\u0130\5t;\2\u012f"+
		"\u0131\7+\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\5.\30\2\u0133\61\3\2\2\2\u0134\u0135\5~@\2\u0135\u0136"+
		"\7\34\2\2\u0136\u0137\5\64\33\2\u0137\u013d\3\2\2\2\u0138\u0139\5~@\2"+
		"\u0139\u013a\7\34\2\2\u013a\u013b\5\66\34\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0134\3\2\2\2\u013c\u0138\3\2\2\2\u013d\63\3\2\2\2\u013e\u013f\7\60\2"+
		"\2\u013f\65\3\2\2\2\u0140\u0141\7\61\2\2\u0141\67\3\2\2\2\u0142\u0145"+
		"\5:\36\2\u0143\u0145\5<\37\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"9\3\2\2\2\u0146\u0147\5|?\2\u0147\u0149\7\32\2\2\u0148\u014a\5> \2\u0149"+
		"\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\33"+
		"\2\2\u014c;\3\2\2\2\u014d\u014e\5z>\2\u014e\u014f\7\34\2\2\u014f\u0150"+
		"\5|?\2\u0150\u0152\7\32\2\2\u0151\u0153\5> \2\u0152\u0151\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\7\33\2\2\u0155=\3\2\2\2"+
		"\u0156\u0157\5@!\2\u0157\u0158\7\35\2\2\u0158\u0159\5> \2\u0159\u015c"+
		"\3\2\2\2\u015a\u015c\5@!\2\u015b\u0156\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"?\3\2\2\2\u015d\u015e\5\"\22\2\u015eA\3\2\2\2\u015f\u0160\5D#\2\u0160"+
		"C\3\2\2\2\u0161\u0165\5F$\2\u0162\u0164\5H%\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0168\u016a\5J&\2\u0169\u0168\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016aE\3\2\2\2\u016b\u016c\7\16\2\2\u016c\u016d\7\32\2\2\u016d"+
		"\u016e\5L\'\2\u016e\u016f\7\33\2\2\u016f\u0170\5P)\2\u0170G\3\2\2\2\u0171"+
		"\u0172\7\17\2\2\u0172\u0173\7\32\2\2\u0173\u0174\5N(\2\u0174\u0175\7\33"+
		"\2\2\u0175\u0176\5R*\2\u0176I\3\2\2\2\u0177\u0178\7\20\2\2\u0178\u0179"+
		"\5T+\2\u0179K\3\2\2\2\u017a\u017b\5\34\17\2\u017bM\3\2\2\2\u017c\u017d"+
		"\5\34\17\2\u017dO\3\2\2\2\u017e\u017f\5V,\2\u017fQ\3\2\2\2\u0180\u0181"+
		"\5V,\2\u0181S\3\2\2\2\u0182\u0183\5V,\2\u0183U\3\2\2\2\u0184\u0187\5\6"+
		"\4\2\u0185\u0187\5\b\5\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"W\3\2\2\2\u0188\u0189\5Z.\2\u0189Y\3\2\2\2\u018a\u018b\7\21\2\2\u018b"+
		"\u018c\7\32\2\2\u018c\u018d\5\\/\2\u018d\u018e\7\22\2\2\u018e\u018f\5"+
		"\\/\2\u018f\u0192\7\33\2\2\u0190\u0193\5\6\4\2\u0191\u0193\5\b\5\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193[\3\2\2\2\u0194\u0199\7\23\2\2"+
		"\u0195\u0199\5\f\7\2\u0196\u0199\5~@\2\u0197\u0199\5\20\t\2\u0198\u0194"+
		"\3\2\2\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"]\3\2\2\2\u019a\u019b\7\n\2\2\u019b\u019e\5\u0080A\2\u019c\u019d\t\4\2"+
		"\2\u019d\u019f\5\u0080A\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a1\5`\61\2\u01a1_\3\2\2\2\u01a2\u01a8\7\30\2\2"+
		"\u01a3\u01a7\5\n\6\2\u01a4\u01a7\5b\62\2\u01a5\u01a7\5f\64\2\u01a6\u01a3"+
		"\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2"+
		"\2\2\u01ab\u01ac\7\31\2\2\u01aca\3\2\2\2\u01ad\u01ae\5\u0080A\2\u01ae"+
		"\u01b0\7\32\2\2\u01af\u01b1\5h\65\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3"+
		"\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\7\33\2\2\u01b3\u01b4\5d\63\2\u01b4"+
		"c\3\2\2\2\u01b5\u01bb\7\30\2\2\u01b6\u01b7\5\20\t\2\u01b7\u01b8\7\36\2"+
		"\2\u01b8\u01ba\3\2\2\2\u01b9\u01b6\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01bf\7\31\2\2\u01bfe\3\2\2\2\u01c0\u01c1\7\b\2\2\u01c1\u01c2\5|?\2\u01c2"+
		"\u01c4\7\32\2\2\u01c3\u01c5\5h\65\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3"+
		"\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\7\33\2\2\u01c7\u01c8\5\6\4\2\u01c8"+
		"\u01d3\3\2\2\2\u01c9\u01ca\5v<\2\u01ca\u01cb\5|?\2\u01cb\u01cd\7\32\2"+
		"\2\u01cc\u01ce\5h\65\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d0\7\33\2\2\u01d0\u01d1\5l\67\2\u01d1\u01d3\3\2\2\2"+
		"\u01d2\u01c0\3\2\2\2\u01d2\u01c9\3\2\2\2\u01d3g\3\2\2\2\u01d4\u01d5\5"+
		"j\66\2\u01d5\u01d6\7\35\2\2\u01d6\u01d7\5h\65\2\u01d7\u01da\3\2\2\2\u01d8"+
		"\u01da\5j\66\2\u01d9\u01d4\3\2\2\2\u01d9\u01d8\3\2\2\2\u01dai\3\2\2\2"+
		"\u01db\u01de\5x=\2\u01dc\u01de\5\u0080A\2\u01dd\u01db\3\2\2\2\u01dd\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\5~@\2\u01e0k\3\2\2\2\u01e1\u01e5"+
		"\7\30\2\2\u01e2\u01e4\5\b\5\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2"+
		"\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e8\u01e9\5n8\2\u01e9\u01ea\7\31\2\2\u01eam\3\2\2\2\u01eb\u01ec"+
		"\7\r\2\2\u01ec\u01ed\5\22\n\2\u01ed\u01ee\7\36\2\2\u01eeo\3\2\2\2\u01ef"+
		"\u01f3\5r:\2\u01f0\u01f3\7\25\2\2\u01f1\u01f3\7\26\2\2\u01f2\u01ef\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3q\3\2\2\2\u01f4\u01f5"+
		"\t\5\2\2\u01f5s\3\2\2\2\u01f6\u01f7\t\6\2\2\u01f7u\3\2\2\2\u01f8\u01fb"+
		"\5x=\2\u01f9\u01fb\5\u0080A\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2"+
		"\u01fbw\3\2\2\2\u01fc\u01fd\t\7\2\2\u01fdy\3\2\2\2\u01fe\u01ff\7\62\2"+
		"\2\u01ff{\3\2\2\2\u0200\u0201\7\62\2\2\u0201}\3\2\2\2\u0202\u0203\7\62"+
		"\2\2\u0203\177\3\2\2\2\u0204\u0205\7\62\2\2\u0205\u0081\3\2\2\2-\u0086"+
		"\u0088\u0092\u00a1\u00a9\u00ae\u00b3\u00b7\u00bf\u00c5\u00d1\u00f9\u0101"+
		"\u010a\u010e\u0115\u011c\u0122\u012c\u0130\u013c\u0144\u0149\u0152\u015b"+
		"\u0165\u0169\u0186\u0192\u0198\u019e\u01a6\u01a8\u01b0\u01bb\u01c4\u01cd"+
		"\u01d2\u01d9\u01dd\u01e5\u01f2\u01fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}