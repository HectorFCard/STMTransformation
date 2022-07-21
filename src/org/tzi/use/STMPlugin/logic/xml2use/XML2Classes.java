package org.tzi.use.STMPlugin.logic.xml2use;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.tzi.use.STMPlugin.logic.xml2use.ast.*;
import org.tzi.use.STMPlugin.logic.xml2use.ast.uml.ASTClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;

public class XML2Classes {
    public static class USEEmitter extends XMLParserBaseListener {
      XMLParser parser;
      ASTModel model = null;
      Map<String, Class<? extends ASTModel>> modelTypes = Map.of("sTM", STMModel.class, "uml", UMLModel.class);

      public USEEmitter(XMLParser parser) {this.parser = parser;}

      public ArrayList<ASTClass> printSpec() {
        return ((UMLModelForTOCL) model).getClasses();
      }

      @Override public void exitAttribute(XMLParser.AttributeContext ctx) {
        String fieldName = ctx.Name().getText();
        String fieldValue = ctx.STRING().getText();
        fieldValue = fieldValue.substring(1, fieldValue.length()-1);
        try {
          model.getLastElement().getClass()
            .getMethod("setField", String.class, String.class)
            .invoke(model.getLastElement(), fieldName, fieldValue);
        } catch (Exception e) {

        }
      }

      @Override public void enterElement(XMLParser.ElementContext ctx) {
        if (model != null) model.enterElem(ctx);
        else if (ctx.Name(0).getText().endsWith(":Model")) {
          //String modelNameText = ctx.Name(0).getText();
          //Integer nameTextEnd = modelNameText.lastIndexOf(":Model");
          Class modelType = UMLModelForTOCL.class;
          try {
            if (modelType != null) model = (ASTModel) modelType.getConstructor().newInstance();
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      }

      @Override public void exitElement(XMLParser.ElementContext ctx) {
        if (ctx.Name(0).getText().endsWith(":Model")) {
          model.doFinalTasks();
        }
        else if (model != null) model.exitElem(ctx);
      }
    }
        
    public static ArrayList<ASTClass> genClasses(File inputFile) throws Exception {
      String inputFilePath = inputFile.getAbsolutePath();

      CharStream input = CharStreams.fromFileName(inputFilePath);
      XMLLexer lexer = new XMLLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      XMLParser parser = new XMLParser(tokens);
      parser.setBuildParseTree(true);
      ParseTree tree = parser.document();

      ParseTreeWalker walker = new ParseTreeWalker();
      USEEmitter emitter = new USEEmitter(parser);
      walker.walk(emitter, tree);
      
      return emitter.printSpec();
    }
}
