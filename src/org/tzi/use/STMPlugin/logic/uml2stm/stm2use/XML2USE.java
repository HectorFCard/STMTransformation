package stm2use;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Stack;
import stm2use.ast.*;

public class XML2USE {
    public static class USEEmitter extends STMParserBaseListener {
      STMParser parser;
      Stack<Object> currElem = new Stack<Object>();
      ASTModel model = null;

      public USEEmitter(STMParser parser) {this.parser = parser;}

      public void printUSESpec() {
        model.printModel();
      }
        
      @Override public void enterModelElem(STMParser.ModelElemContext ctx) {
        model = new ASTModel();
        currElem.add(model);
      }
    
      @Override public void exitModelElem(STMParser.ModelElemContext ctx) {
        currElem.pop();
        model.assignTypes();
        System.out.println(model.getOwnedElements().size());
      }
      
      @Override public void enterModelOwnedElem(STMParser.ModelOwnedElemContext ctx) {
        String classifierType = ctx.attribute(0).STRING().getText();
        classifierType = classifierType.substring(1, classifierType.length()-1);
        //System.out.println(classifierType);
        if (classifierType.equals("sTM:SnapshotClassifier")) currElem.add(new ASTSnapshotClass());
        else if (classifierType.equals("sTM:Association")) currElem.add(new ASTAssociation());
        else if (classifierType.equals("sTM:Enumeration")) currElem.add(new ASTEnumeration());
        else if (classifierType.equals("sTM:TransitionClass")) currElem.add(new ASTTransitionClass());
        else if (classifierType.equals("sTM:DataType")) currElem.add(new ASTClassifier());
      }

      @Override public void exitModelOwnedElem(STMParser.ModelOwnedElemContext ctx) {
        model.addElem((ASTClassifier) currElem.lastElement());
        currElem.pop();
      }
      
      @Override public void enterCompClassElem(STMParser.CompClassElemContext ctx) {
        currElem.add(new ASTComponentClass());
      }

      @Override public void exitCompClassElem(STMParser.CompClassElemContext ctx) {
        ASTComponentClass newClass = (ASTComponentClass) currElem.pop();
        ((ASTSnapshotClass) currElem.lastElement()).addComponentClass(newClass);
      }
      
      @Override public void enterAttributeElem(STMParser.AttributeElemContext ctx) {
        currElem.add(new ASTProperty());
      }

      @Override public void exitAttributeElem(STMParser.AttributeElemContext ctx) {
        ASTProperty newAttr = (ASTProperty) currElem.pop();
        if (currElem.lastElement() instanceof ASTComponentClass) {
          ((ASTComponentClass) currElem.lastElement()).addAttribute(newAttr);
        }
        else if (currElem.lastElement() instanceof ASTTransitionClass) {
          ((ASTTransitionClass) currElem.lastElement()).addAttribute(newAttr);
        }
      }
      
      @Override public void enterQueryOpElem(STMParser.QueryOpElemContext ctx) {
        currElem.add(new ASTQueryOperation());
      }
      
      @Override public void exitQueryOpElem(STMParser.QueryOpElemContext ctx) {
        ASTQueryOperation newOp = (ASTQueryOperation) currElem.pop();
        ((ASTComponentClass) currElem.lastElement()).addOperation(newOp);
      }

      @Override public void enterParamsElem(STMParser.ParamsElemContext ctx) {
        currElem.add(new ASTParameter());
      }
      
      @Override public void exitParamsElem(STMParser.ParamsElemContext ctx) {
        ASTParameter newParam = (ASTParameter) currElem.pop();
        ((ASTQueryOperation) currElem.lastElement()).addParameter(newParam);
      }
      
      @Override public void enterCondElem(STMParser.CondElemContext ctx) {
        String conditionType = ctx.Conditions(0).getText();
        if (conditionType.equals("precondition")) conditionType = "pre";
        else if (conditionType.equals("postcondition")) conditionType = "post";
        if (conditionType.equals("bodyCondition")) conditionType = "body";
        currElem.add(new ASTConstraint(conditionType));
      }
      
      @Override public void exitCondElem(STMParser.CondElemContext ctx) {
        ASTConstraint newParam = (ASTConstraint) currElem.pop();
        ((ASTQueryOperation) currElem.lastElement()).addCondition(newParam);
      }

      @Override public void enterConstrElem(STMParser.ConstrElemContext ctx) {
        currElem.add(new ASTConstraint("inv"));
      }

      @Override public void exitConstrElem(STMParser.ConstrElemContext ctx) {
        ASTConstraint newConstr = (ASTConstraint) currElem.pop();
        try {
          currElem.lastElement().getClass()
          .getMethod("addInv", ASTConstraint.class)
          .invoke(currElem.lastElement(), newConstr);
        } catch (Exception e) {
          e.printStackTrace();;
        }
      }
      
      @Override public void exitBodyElem(STMParser.BodyElemContext ctx) {
          String bodyText = ctx.content().getText();
          ((ASTConstraint) currElem.lastElement()).setField("body", bodyText);
      }
      
      @Override public void enterOwnedEndElem(STMParser.OwnedEndElemContext ctx) {
        currElem.add(new ASTProperty());
      }

      @Override public void exitOwnedEndElem(STMParser.OwnedEndElemContext ctx) {
        ASTProperty newEnd = (ASTProperty) currElem.pop();
        ((ASTAssociation) currElem.lastElement()).addMemberEnds(newEnd);
      }
      
      @Override public void enterLiteralElem(STMParser.LiteralElemContext ctx) {
        currElem.add(new ASTEnumLiteral());
      }
      
      @Override public void exitLiteralElem(STMParser.LiteralElemContext ctx) {
        ASTEnumLiteral newLiteral = (ASTEnumLiteral) currElem.pop();
        ((ASTEnumeration) currElem.lastElement()).addLiteral(newLiteral);
      }
      
      @Override public void exitGenElem(STMParser.GenElemContext ctx) {
        String genType = ctx.attribute(0).STRING().getText();
        genType = genType.substring(0, genType.length() - 1);
        try {
          currElem.lastElement().getClass()
            .getMethod("setField", String.class, String.class)
            .invoke(currElem.lastElement(), "general", genType);
        } catch (Exception e) {
          
        }
      }
      
      @Override public void enterCtxElem(STMParser.CtxElemContext ctx) {
        currElem.add(new ASTProperty());
      }

      @Override public void exitCtxElem(STMParser.CtxElemContext ctx) {
        ASTProperty newAttr = (ASTProperty) currElem.pop();
        ((ASTTransitionClass) currElem.lastElement()).addAttribute(newAttr);
      }

      @Override public void exitAttribute(STMParser.AttributeContext ctx) {
        String fieldName = ctx.Name().getText();
        String fieldValue = ctx.STRING().getText();
        fieldValue = fieldValue.substring(1, fieldValue.length()-1);
        //System.out.println(fieldName);
        //System.out.println(fieldValue);
        try {
          currElem.lastElement().getClass()
            .getMethod("setField", String.class, String.class)
            .invoke(currElem.lastElement(), fieldName, fieldValue);
        } catch (Exception e) {
          
        }
      }
    }

        
    public static void main(String[] args) throws Exception {
        String inputFile = "/uml2stm/temp/SteamBoilerSTM.ecore";
        if ( args.length>0 ) inputFile = args[0];

        CharStream input = CharStreams.fromFileName(inputFile);
        STMLexer lexer = new STMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        STMParser parser = new STMParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.document();

        ParseTreeWalker walker = new ParseTreeWalker();
        USEEmitter converter = new USEEmitter(parser);
        walker.walk(converter, tree);
        
        converter.printUSESpec();
    }
}
