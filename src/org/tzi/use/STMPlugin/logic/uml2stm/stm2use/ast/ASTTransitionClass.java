package org.tzi.use.STMPlugin.logic.uml2stm.stm2use.ast;

import java.util.ArrayList;

public class ASTTransitionClass extends ASTClassifier {
    ArrayList<ASTProperty> attributes  = new ArrayList<ASTProperty>();
    ArrayList<ASTConstraint> invariants  = new ArrayList<ASTConstraint>();
    
    public void addAttribute(ASTProperty a) {
        attributes.add(a);
    }

    public ArrayList<ASTProperty> getAttributes() {
        return attributes;
    }

    public void addInv(ASTConstraint c) {
        invariants.add(c);
    }

    @Override public String getConstrText() {
        String invs = "";
        for (ASTConstraint i : invariants) {
            invs = invs.concat("context "+name+"\n"+i.toString()+"\n");
        }
        return invs;
    }

    public String toString() {
        String abs = (isAbstract) ? "abstract " : "";
        String attrs = "";
        String superTypeName = "";
        if (superType != null) superTypeName = " < "+superType.getName();
        if (attributes.size() > 0) attrs = "attributes\n";
        for (ASTProperty a : attributes) {
            if (a.getType() != null)
                attrs = attrs.concat(a.getName()+" : "+a.getType().getName()+"\n");
        }
        return abs+"class "+name+superTypeName+"\n"+attrs+"end\n\n";
    }
}