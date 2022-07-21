package org.tzi.use.STMPlugin.logic.xml2use.ast;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTClass;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTClassifier;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTProperty;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTAssociation;

import java.util.ArrayList;

public class UMLModelForTOCL extends UMLModel {
    private ArrayList<ASTClass> classes = new ArrayList<ASTClass>();

    @Override
    public void doFinalTasks() {
        assignTypes();
        collectClasses();
    }

    public void collectClasses() {
        for (ASTClassifier e : packagedElements) {
            if (e instanceof ASTClass) {
                classes.add((ASTClass) e);
            }
            if (e instanceof ASTAssociation) {
                ArrayList<ASTProperty> memberEnds = ((ASTAssociation) e).getMemberEnds();
                ASTClassifier type1 = memberEnds.get(0).getType();
                ASTClassifier type2 = memberEnds.get(1).getType();

                boolean assigned1 = false;
                boolean assigned2 = false;
                for (ASTClass c : classes) {
                    //System.out.println("Type 1 is "+type1.getName());
                    //System.out.println("Type 2 is "+type2.getName());
                    if (c.getName().equals(type1.getName())) {
                        c.addAttribute(memberEnds.get(1));
                        assigned1 = true;
                    }
                    else if (c.getName().equals(type2.getName())) {
                        c.addAttribute(memberEnds.get(0));
                        assigned2 = true;
                    }
                }
                if (assigned1 && assigned2) {
                    //System.out.println("both were assigned!");
                }
            }
        }
    }

    public ArrayList<ASTClass> getClasses() {
        return classes;
    }
    
    /*public void addEndsAsAttributes() {
        for (ASTClassifier e : packagedElements) {
            if (e instanceof ASTAssociation) {
                ArrayList<ASTProperty> memberEnds = ((ASTAssociation) e).getMemberEnds();
                ASTClassifier type1 = memberEnds.get(0).getType();
                ASTClassifier type2 = memberEnds.get(1).getType();

                boolean assigned1 = false;
                boolean assigned2 = false;
                for (ASTClass c : classes) {
                    System.out.println("Type 1 is "+type1.getName());
                    System.out.println("Type 2 is "+type2.getName());
                    if (c.getName().equals(type1.getName())) {
                        c.addAttribute(memberEnds.get(1));
                        assigned1 = true;
                    }
                    else if (c.getName().equals(type2.getName())) {
                        c.addAttribute(memberEnds.get(0));
                        assigned2 = true;
                    }
                }
                if (assigned1 && assigned2) {
                    System.out.println("both were assigned!");
                }
            }
        }
    }*/
}
