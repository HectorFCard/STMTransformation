import java.util.List;

public class ASTAssociationClassCallExp extends ASTCallExp{
    public ASTAssociationClassCallExp(ASTOclExpression src, String n, String a) {
            super(src);
            className = n;
            args = a;
    }

    String className;
    String args;
}