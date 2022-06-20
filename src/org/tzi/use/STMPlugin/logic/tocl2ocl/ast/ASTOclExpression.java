package org.tzi.use.STMPlugin.logic.tocl2ocl.ast;

public class ASTOclExpression {
    public ASTOclExpression(String t) {
        type = t;
    }
    
    public String getType() {
        return type;
    }

    String type;
}