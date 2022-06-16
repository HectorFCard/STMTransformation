import java.util.List;

public class ASTTupleLiteralExp extends ASTLiteralExp {
    public ASTTupleLiteralExp(List<ASTVariableDeclaration> p) {
        //check if parts all have initExpressions and proper types
        super("Tuple");
        parts = p;
    }

    List<ASTVariableDeclaration> parts;
}