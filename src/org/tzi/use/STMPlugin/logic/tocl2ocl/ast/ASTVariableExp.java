public class ASTVariableExp extends ASTOclExpression{
    public ASTVariableExp(ASTVariableDeclaration d) {
        super(d.getType().getName());
        declaration = d;
    }

    ASTVariableDeclaration declaration;
}