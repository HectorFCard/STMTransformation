package org.tzi.use.logic.uml2stm.stm2use.ast;

import java.util.ArrayList;

public class ASTSnapshotClass extends ASTClassifier {
    ArrayList<ASTProperty> attributes = new ArrayList<ASTProperty>();
    ArrayList<ASTQueryOperation> queryOps = new ArrayList<ASTQueryOperation>();
    ArrayList<ASTConstraint> invariants = new ArrayList<ASTConstraint>();
    ArrayList<ASTComponentClass> components = new ArrayList<ASTComponentClass>();

    public ArrayList<ASTProperty> getAttributes() {
        return attributes;
    }

    public ArrayList<ASTQueryOperation> getQueryOps() {
        return queryOps;
    }
    
    public void addComponentClass(ASTComponentClass c) {
        components.add(c);
    }

    public ArrayList<ASTComponentClass> getComponents() {
        return components;
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
        for (ASTComponentClass c : components) {
            if(c.getConstrText().length() > 0)
                invs = invs.concat(c.getConstrText()+"\n");
        }
        return invs;
    }

    public String toString() {
        String abs = (isAbstract) ? "abstract " : "";
        String attrs = "";
        String qOps = "";
        String comps = "";
        String superName = "";
        if (superType != null) superName = " < "+superType.getName(); 
        if (attributes.size() > 0) attrs = "attributes\n";
        for (ASTProperty a : attributes) {
            attrs = attrs.concat(a.getName()+" : "+a.getType().getName()+"\n");
        }
        for (ASTComponentClass c : components) {
            comps = comps.concat(c.toString());
        }
        return abs+"class "+name+superName+"\n"+attrs+qOps+"end\n\n"+comps;
    }
}