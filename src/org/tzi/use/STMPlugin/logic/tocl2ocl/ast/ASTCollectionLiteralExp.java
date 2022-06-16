import java.util.ArrayList;

public class ASTCollectionLiteralExp extends ASTLiteralExp{
    public ASTCollectionLiteralExp(String k, ArrayList<ASTCollectionLiteralPart> p) {
        super(k);
        kind = k;
        parts = p;
    }

    String kind;
    ArrayList<ASTCollectionLiteralPart> parts;
}