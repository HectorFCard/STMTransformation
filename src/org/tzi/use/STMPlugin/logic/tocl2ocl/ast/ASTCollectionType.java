package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTCollectionType extends ASTType {
    public ASTCollectionType(String k, ASTType e) {
        super(k+'('+e.name+')');
        kind = k;
        elementType = e;
    }

    String kind;
    ASTType elementType;
}