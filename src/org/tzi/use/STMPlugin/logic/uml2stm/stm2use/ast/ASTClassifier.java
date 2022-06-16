package STM2USE.ast;

public class ASTClassifier {
    String name;
    String superTypeIndex;
    ASTClassifier superType;

    public void setField(String fieldName, String fieldValue) {
        if (fieldName.equals("name")) name = fieldValue;
        else if (fieldName.equals("general")) superTypeIndex = fieldValue;
    }

    public void setSuperType(ASTClassifier t) {
        superType = t;
    }

    public String getSuperTypeIndex() {
        return superTypeIndex;
    }

    public String getConstrText() {
        return "";
    }
    
    public String getName() {
        return name;
    }
}
