public class ASTNullLiteralExp extends ASTPrimitiveLiteralExp {
    public ASTNullLiteralExp() {
        super("OclNull");
    }

    String value = "null";
}