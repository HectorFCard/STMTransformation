package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTUnlimitedNaturalLiteralExp extends ASTPrimitiveLiteralExp {
    public ASTUnlimitedNaturalLiteralExp(String v) {
        super("UnlimitedNatural");
        value = Integer.parseInt(v);
    }

    Integer value;
}