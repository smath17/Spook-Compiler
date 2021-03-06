package dk.aau.cs.d403.ast;

public class Enums {
    public enum DataType {
        NUM,
        BOOL,
        VEC2,
        VEC3,
        VEC4
    }

    public static String dataTypeToStringSpook(DataType dataType) {
        switch (dataType) {
            case NUM:
                return "Num";
            case BOOL:
                return "Bool";
            case VEC2:
                return "Vec2";
            case VEC3:
                return "Vec3";
            case VEC4:
                return "Vec4";
            default:
                return "InvalidType";
        }
    }

    public static String dataTypeToStringGLSL(DataType dataType) {
        switch (dataType) {
            case NUM:
                return "float";
            case BOOL:
                return "bool";
            case VEC2:
                return "vector2";
            case VEC3:
                return "vector3";
            case VEC4:
                return "vector4";
            default:
                return "InvalidType";
        }
    }

    public enum ReturnType {
        VOID,
        NUM,
        BOOL,
        VEC2,
        VEC3,
        VEC4
    }

    public static String returnTypeToStringSpook(ReturnType returnType) {
        switch (returnType) {
            case NUM:
                return dataTypeToStringSpook(DataType.NUM);
            case BOOL:
                return dataTypeToStringSpook(DataType.BOOL);
            case VEC2:
                return dataTypeToStringSpook(DataType.VEC2);
            case VEC3:
                return dataTypeToStringSpook(DataType.VEC3);
            case VEC4:
                return dataTypeToStringSpook(DataType.VEC4);
            case VOID:
                return "Void";
            default:
                return "InvalidType";
        }
    }

    public static String returnTypeToStringGLSL(ReturnType returnType) {
        switch (returnType) {
            case NUM:
                return dataTypeToStringGLSL(DataType.NUM);
            case BOOL:
                return dataTypeToStringGLSL(DataType.BOOL);
            case VEC2:
                return dataTypeToStringGLSL(DataType.VEC2);
            case VEC3:
                return dataTypeToStringGLSL(DataType.VEC3);
            case VEC4:
                return dataTypeToStringGLSL(DataType.VEC4);
            case VOID:
                return "void";
            default:
                return "InvalidType";
        }
    }

    public enum ClassType {
        CIRCLE,
        RECTANGLE,
        SQUARE,
        TRIANGLE,
        SHAPE,
        COLOR
    }

    public static String classTypeToString(ClassType classType) {
        switch (classType) {
            case CIRCLE:
                return "Circle";
            case RECTANGLE:
                return "Rectangle";
            case TRIANGLE:
                return "Triangle";
            case SHAPE:
                return "Shape";
            case COLOR:
                return "Color";
            default:
                return "InvalidClassType";
        }
    }

    public enum Operator {
        ADD,
        SUB,
        MOD,
        DIV,
        MUL
    }

    public static String operatorToString(Operator operator) {
        switch (operator) {
            case ADD:
                return "+";
            case SUB:
                return "-";
            case MOD:
                return "%";
            case DIV:
                return "/";
            case MUL:
                return "*";
            default:
                return "InvalidOperator";
        }
    }

    public enum BoolOperator {
        EQUAL,
        OR,
        AND,
        NOT_EQUAL,
        GREATER_THAN,
        GREATER_OR_EQUAL,
        LESS_THAN,
        LESS_OR_EQUAL,
        NOT
    }

    public static String boolOperatorToString(BoolOperator boolOperator) {
        switch (boolOperator) {
            case EQUAL:
                return "==";
            case OR:
                return "||";
            case AND:
                return "&&";
            case NOT_EQUAL:
                return "!=";
            case GREATER_THAN:
                return ">";
            case GREATER_OR_EQUAL:
                return ">=";
            case LESS_THAN:
                return "<";
            case LESS_OR_EQUAL:
                return "<=";
            case NOT:
                return "!";
            default:
                return "Unknown Boolean Operator";
        }
    }
}
