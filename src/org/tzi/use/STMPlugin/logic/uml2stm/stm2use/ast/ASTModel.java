import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ASTModel {
    String name;
    ArrayList<ASTClassifier> ownedElements = new ArrayList<ASTClassifier>();

    public void assignTypes() {
        for (ASTClassifier e : ownedElements) {
            if (e instanceof ASTSnapshotClass) {
                for (ASTProperty a : ((ASTSnapshotClass) e).getAttributes()) {
                    a.setType(findType(a.getTypeIndex()));
                }
                for (ASTQueryOperation o : ((ASTSnapshotClass) e).getQueryOps()) {
                    o.setType(findType(o.getTypeIndex()));
                }
                for (ASTComponentClass c : ((ASTSnapshotClass) e).getComponents()){
                    for (ASTProperty a : c.getAttributes()) {
                        a.setType(findType(a.getTypeIndex()));
                    }
                    for (ASTQueryOperation o : c.getQueryOps()) {
                        o.setType(findType(o.getTypeIndex()));
                    }
                    if (c.getSuperTypeIndex() != null) {
                        ASTClassifier type = findType(c.getSuperTypeIndex());
                        c.setSuperType(type);
                    }
                }
                if (((ASTSnapshotClass) e).getSuperTypeIndex() != null) {
                    ASTClassifier type = findType(((ASTSnapshotClass) e).getSuperTypeIndex());
                    ((ASTSnapshotClass) e).setSuperType(type);
                }
            }
            if (e instanceof ASTAssociation) {
                for (ASTProperty m : ((ASTAssociation) e).getMemberEnds()) {
                    m.setType(findType(m.getTypeIndex()));
                }
            }
            if (e instanceof ASTTransitionClass) {
                for (ASTProperty a : ((ASTTransitionClass) e).getAttributes()) {
                    a.setType(findType(a.getTypeIndex()));
                }
                if (((ASTTransitionClass) e).getSuperTypeIndex() != null) {
                    ASTClassifier type = findType(((ASTTransitionClass) e).getSuperTypeIndex());
                    ((ASTTransitionClass) e).setSuperType(type);
                }
            }
        }
    }

    public ASTClassifier findType(String i) {
        Pattern integerPattern = Pattern.compile("\\d+");
        Matcher matcher = integerPattern.matcher(i);

        ArrayList<Integer> indexes = new ArrayList<>();
        while (matcher.find()) {
            indexes.add(Integer.parseInt(matcher.group()));
        }

        if (indexes.size() == 2) {
            return ((ASTSnapshotClass) ownedElements.get(indexes.get(0)))
                .getComponents().get(indexes.get(1));
        } else if (indexes.size() == 1) {
            return ownedElements.get(indexes.get(0));
        } else return null;
    }

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
    }
    
    public void addElem(ASTClassifier e) {
        ownedElements.add(e);
    }

    public ArrayList<ASTClassifier> getOwnedElements() {
        return ownedElements;
    }

    public void printModel() {
        try {
            PrintWriter writer = new PrintWriter(name+".use", "UTF-8");
            writer.print(toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String toString() {
        String elemText = "";
        String constrText = "";
        for (ASTClassifier e : ownedElements) {
            if (e.getClass() == ASTClassifier.class) continue;
            elemText = elemText.concat(e.toString());
        }
        for (ASTClassifier e : ownedElements) {
            constrText = constrText.concat(e.getConstrText());
        }
        if (constrText.length() > 0) constrText = "constraints\n".concat(constrText);
        return "model "+name+"\n\n"+elemText+"\n"+constrText+"\n";
    }
}