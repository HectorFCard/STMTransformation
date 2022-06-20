package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTCollectionRange extends ASTCollectionLiteralPart {
    public ASTCollectionRange(ASTOclExpression f, ASTOclExpression l) {
        first = f;
        last = l;
    }

    ASTOclExpression first;
    ASTOclExpression last;
}