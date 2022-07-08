package org.tzi.use.STMPlugin.logic.xml2use.ast.uml;

import java.util.ArrayList;

public class ASTEnumeration extends ASTClassifier {
    ArrayList<ASTEnumLiteral> literals = new ArrayList<ASTEnumLiteral>();

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
    }

    public void addLiteral(ASTEnumLiteral l) {
        literals.add(l);
    }
    
    public String toString() {
        ArrayList<String> lits = new ArrayList<String>();
        for (ASTEnumLiteral l : literals) {
            lits.add(l.getName());
        }
        String litText = "" ;
        if (lits.size() > 0) litText = String.join(", ", lits);
        return "enum "+name+" {"+litText+"}\n\n";
    }
}