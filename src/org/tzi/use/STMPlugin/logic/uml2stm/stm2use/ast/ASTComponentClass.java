package org.tzi.use.STMPlugin.logic.uml2stm.stm2use.ast;

import java.util.ArrayList;

public class ASTComponentClass extends ASTClassifier {
    ArrayList<ASTProperty> attributes = new ArrayList<ASTProperty>();
    ArrayList<ASTQueryOperation> queryOps = new ArrayList<ASTQueryOperation>();
    ArrayList<ASTConstraint> invariants = new ArrayList<ASTConstraint>();

    public void setSuperType(ASTClassifier t) {
        superType = t;
    }

    public String getSuperTypeIndex() {
        return superTypeIndex;
    }
    
    public void addAttribute(ASTProperty a) {
        attributes.add(a);
    }

    public ArrayList<ASTProperty> getAttributes() {
        return attributes;
    }

    public void addOperation(ASTQueryOperation o) {
        queryOps.add(o);
    }

    public ArrayList<ASTQueryOperation> getQueryOps() {
        return queryOps;
    }

    public void addInv(ASTConstraint c) {
        invariants.add(c);
    }

    @Override public String getConstrText() {
        String invs = "";
        for (ASTConstraint i : invariants) {
            invs = invs.concat("context "+name+"\n"+i.toString()+"\n");
        }
        for (ASTQueryOperation o : queryOps) {
            if(o.getCondText().length() > 0)
                invs = invs.concat("context "+name+"::"+o.toString()+"\n"+o.getCondText()+"\n");
        }
        return invs;
    }

    public String toString() {
        String abs = (isAbstract) ? "abstract " : "";
        String attrs = "";
        String qOps = "";
        String superTypeName = "";
        if (superType != null) superTypeName = " < "+superType.getName();
        if (attributes.size() > 0) attrs = "attributes\n"; 
        for (ASTProperty a : attributes) {
            if (a.aggregation.equals("composite")) continue;
            attrs = attrs.concat(a.getName()+" : "+a.getType().getName()+"\n");
        }
        if (queryOps.size() > 0) qOps = "operations\n"; 
        for (ASTQueryOperation o : queryOps) {
            qOps = qOps.concat(o.toString()+"\n");
        }
        return abs+"class "+name+superTypeName+"\n"+attrs+qOps+"end\n\n";
    }
}