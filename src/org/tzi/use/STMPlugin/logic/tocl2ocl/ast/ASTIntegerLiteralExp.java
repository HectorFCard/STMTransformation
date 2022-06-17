public class ASTIntegerLiteralExp extends ASTPrimitiveLiteralExp {
    public ASTIntegerLiteralExp(String v) {
        super("Integer");
        value = Integer.parseInt(v);
    }

    Integer value;
}