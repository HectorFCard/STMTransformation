package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

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