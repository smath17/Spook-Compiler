parser grammar SpookParser;
options { tokenVocab=SpookLexer; }

// Shader() {} (Needed)
// Comments, Classes and functions can be declared outside (under) of the main function
program
    : main (comment | classDecl | functionDecl)*;

// Shader() {} (Needed), Declarations (Optional), Comments (Optional)
main
    : MAIN block;

// One or more declarations
declarations
    : declaration SEMICOLON declarations
    | declaration SEMICOLON;

// Int/float/vector, booleans, object declarations and object function calls
declaration
    : variableDecl
    | objectDecl;

statements
    : statement statements
    | statement;

statement
    : declaration SEMICOLON
    | assignment SEMICOLON
    | functionCall SEMICOLON
    | objectVariableAssign SEMICOLON
    | conditionalStatement
    | iterativeStatement;

/* Blocks */
block: LEFT_BRACKET (statements | comment)* RIGHT_BRACKET;
functionBlock: LEFT_BRACKET (statements | comment)* returnStatement RIGHT_BRACKET;
classBlock: LEFT_BRACKET (declarations | functionDecl | comment)* RIGHT_BRACKET;

// Assignment
assignment
    : variableName ASSIGN (expression | assignedVariableName);

expression
    : variableName
    | integerExpression
    | floatExpression
    | vector2Expression
    | vector3Expression
    | vector4Expression
    | boolExpression
    | ternaryOperator;

// Expressions
integerExpression: naturalNumber | lowPrecedence | mathFunction;
floatExpression: realNumber | lowPrecedence | mathFunction;
vector2Expression: LEFT_PAREN floatExpression COMMA floatExpression RIGHT_PAREN;
vector3Expression: LEFT_PAREN floatExpression COMMA floatExpression COMMA floatExpression RIGHT_PAREN;
vector4Expression: LEFT_PAREN floatExpression COMMA floatExpression COMMA floatExpression COMMA floatExpression RIGHT_PAREN;
boolExpression: BOOL_LITERAL | boolOperations;
ternaryOperator: boolExpression QUESTION expression COLON expression;

// Conditional statements
conditionalStatement
    : ifElseStatement;

// If-else if-else
ifElseStatement: IF LEFT_PAREN boolExpression RIGHT_PAREN (block | statement) (ELSE_IF LEFT_PAREN boolExpression RIGHT_PAREN (block | statement))* (ELSE (block | statement))?;

// Single-line comment
comment
    : COMMENT_STRING;

/* Class declaration */
classDecl
    : CLASS className ((EXTENDS | IMPLEMENTS) classType)? classBlock;

/* Object */
objectDecl
    : classType objectVariableName ASSIGN LEFT_PAREN objectArgs* RIGHT_PAREN;
objectArgs
    : objectArg COMMA objectArgs
    | objectArg;
objectArg
    : variableName
    | realNumber
    | lowPrecedence
    | classProperty
    | functionCall;

//Function calls
functionCall
    : nonObjectFunctionCall
    | objectFunctionCall;

//Non-object funtion calls
nonObjectFunctionCall
    :functionName LEFT_PAREN objectArgs RIGHT_PAREN;

//Object variable assignment
objectVariableAssign
    : objectVariableName DOT variableName ASSIGN (mathFunction | objectArg);

// Object function calls
objectFunctionCall
    : (objectVariableName DOT functionName ASSIGN (objectArgs? | LEFT_PAREN objectArgs? RIGHT_PAREN)
    | objectVariableName DOT functionName LEFT_PAREN objectArgs? RIGHT_PAREN);

// Color function call
classProperty
    : classType DOT (variableName | predefinedFunctionName);


/* Function declaration */
functionDecl
    : returnType functionName LEFT_PAREN functionArgs? RIGHT_PAREN functionBlock
    | VOID functionName LEFT_PAREN functionArgs? RIGHT_PAREN block;

functionArgs
    : functionArg COMMA functionArgs
    | functionArg;
functionArg
    : dataType variableName;

returnStatement: RETURN (variableName | realNumber | BOOL_LITERAL | expression) SEMICOLON;

/* Integer, float and vector declaration */
variableDecl
    : dataType (variableName | assignment);

arithOperand
    : realNumber | mathFunction | variableName | UNIFORM;

//Precedence, goes through low to high, ends at atom
lowPrecedence
    : highPrecedence ((ADD | SUB) highPrecedence)*;
highPrecedence
    : atomPrecedence ((MUL | MOD | DIV) atomPrecedence)*;
atomPrecedence
    : SUB? arithOperand
    | LEFT_PAREN lowPrecedence RIGHT_PAREN;


// Mathematical functions
mathFunction
    : function LEFT_PAREN (arithOperand | lowPrecedence) RIGHT_PAREN;

//Loops
iterativeStatement
    : forStatement;

forStatement
    : FOR LEFT_PAREN (DIGIT | variableDecl | variableName | assignment) TO DIGIT RIGHT_PAREN (block | statement);

// Recursive boolean operations
boolOperations
    : boolOperation boolOperations
    | boolOperation;

// Boolean operations
boolOperation
    : (BOOL_LITERAL | variableName) boolOperator (BOOL_LITERAL | variableName | (LEFT_PAREN boolOperation RIGHT_PAREN))
    | boolOperator (BOOL_LITERAL | variableName | (LEFT_PAREN boolOperation RIGHT_PAREN))
    | LEFT_PAREN boolOperation RIGHT_PAREN;






// Numbers
realNumber: naturalNumber | FLOAT_DIGIT | FLOAT_DIGIT_NEGATIVE;
naturalNumber: DIGIT | DIGIT_NEGATIVE;

// Boolean operators
boolOperator
    : EQUAL
    | OR
    | AND
    | NOT_EQUAL
    | NOT;

// Math functions
function
    : ABS
    | SIN
    | COS
    | TAN;

// Return types
returnType
    : dataType;

// Pre-defined classes
classType
    : CIRCLE
    | RECTANGLE
    | TRIANGLE
    | SHAPE
    | COLOR
    | CIRCLEGRADIENT
    | LINEGRADIENT;

// Data types
dataType
    : INT
    | FLOAT
    | BOOL
    | VECTOR2
    | VECTOR3
    | VECTOR4;

// Variable name
predefinedFunctionName
    : colorName;
colorName
    : BLACK | WHITE | RED | GREEN | BLUE;
objectVariableName
    : ID;
functionName
    : ID;
variableName
    : ID;
className
    : ID;
assignedVariableName
    : ID;