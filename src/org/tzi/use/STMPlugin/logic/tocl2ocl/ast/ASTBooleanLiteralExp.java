public class ASTBooleanLiteralExp extends ASTPrimitiveLiteralExp {
    public ASTBooleanLiteralExp(Boolean v) {
        super("Boolean");
        value =  v;
    }

    Boolean value;
}