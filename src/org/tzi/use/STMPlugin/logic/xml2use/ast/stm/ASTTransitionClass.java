package org.tzi.use.STMPlugin.logic.xml2use.ast.stm;

import java.util.ArrayList;

public class ASTTransitionClass extends ASTClassifier {
    ArrayList<ASTProperty> attributes  = new ArrayList<ASTProperty>();
    ArrayList<ASTConstraint> invariants  = new ArrayList<ASTConstraint>();
    public Boolean isParentClass = false;

    public void doFinalTasks() {
        if (isParentClass) {
            ASTConstraint sameTrans = new ASTConstraint("inv");
            sameTrans.setField("name", "sameTransition");
            sameTrans.setField("body", name + ".allInstances()->forAll(t : " + name + " | (self.nextS = t.nextS and self.beforeS = t.beforeS) implies self = t)");
            addInv(sameTrans);
            return;
        }

        ASTConstraint validContext = new ASTConstraint("inv");
        validContext.setField("name", "validContext");
        validContext.setField("body", "self.transitionContext.snapshot = self.beforeS");
        addInv(validContext);
    }
    
    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("general")) superTypeIndex = fieldValue;
        else if (fieldName.equals("isAbstract")) isAbstract = Boolean.parseBoolean(fieldValue);
        else if (fieldName.equals("isParentClass")) isParentClass = Boolean.parseBoolean(fieldValue);
    }
    
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