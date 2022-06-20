package org.tzi.use.STMPlugin.logic.tocl2ocl;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;


public class TOCLTranslator {
    public static class OCLEmitter extends TOCLParserBaseListener {
        TOCLParser parser;
        public OCLEmitter(TOCLParser parser) {this.parser = parser;}
        ParseTreeProperty<String> ocl = new ParseTreeProperty<String>();
        String getOCL(ParseTree ctx) { return ocl.get(ctx); }
        void setOCL(ParseTree ctx, String s) { ocl.put(ctx, s); }

        Stack<String> stack = new Stack<String>();
        //BASIC RULES

        public void exitExpressionInOcl(TOCLParser.ExpressionInOclContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String expressionInOcl = tokens.getText(ctx);

            CharSequence toclV;
            CharSequence oclV;
            while (!stack.empty()) {
                toclV = stack.pop();
                oclV = stack.pop();

                expressionInOcl = expressionInOcl.replace(toclV, oclV);
            }
            setOCL(ctx,expressionInOcl);
        }

        public void exitOclExpression(TOCLParser.OclExpressionContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            setOCL(ctx, tokens.getText(ctx));
        }

        public void exitBinaryOperationExp(TOCLParser.BinaryOperationExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            setOCL(ctx, tokens.getText(ctx));
        }

        //TOCL Translation Rules
        public void exitNextExp(TOCLParser.NextExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            oclTranslation = "self.getCurrentSnapshot().getNext().sat("+getOCL(ctx.getChild(1))+")";
            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void exitAlwaysExp(TOCLParser.AlwaysExpContext ctx) {
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            if (ctx.getChildCount() == 2) {
                oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->forAll(s | s.sat("+getOCL(ctx.getChild(1))+"))";
                //setOCL(ctx, "let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->forAll(s | s.sat("+getOCL(ctx.getChild(1))+"))");
                stack.push(oclTranslation);
                stack.push(origTocl);
                
                //let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->forAll(s | s.sat(P))
            } else {
                if (ctx.op.getText().equals("until")) {
                    oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in let FSQ = CS.getPost()->select(s | s.sat("+getOCL(ctx.getChild(3))+"))->asOrderedSet()->first() in if (FSQ.isDefined()) then (FSQ.getPre()-CS.getPre())->forAll(s | s.sat("+getOCL(ctx.getChild(1))+") else CS.getPost()->including(CS)->forAll(s | s.sat("+getOCL(ctx.getChild(1))+")) endif";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
                else {
                    oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in let LSQ = CS.getPre()->select(s | s.sat("+getOCL(ctx.getChild(3))+"))->asOrderedSet()->first() in if (LSQ.isDefined()) then (CS.getPre()->including(CS) - LSQ.getPre())->including(LSQ)->forAll(s | s.sat("+getOCL(ctx.getChild(1))+")) else CS.getPre()->forAll(s | s.sat("+getOCL(ctx.getChild(1))+")) endif";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
            }
        }

        public void exitSometimeExp(TOCLParser.SometimeExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            if (ctx.getChildCount() == 2) {
                oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in CS.getPost()->including(CS)->exists(s | s.sat("+getOCL(ctx.getChild(1))+"))";
                
                stack.push(oclTranslation);
                stack.push(origTocl);
                
            } else {
                if (ctx.op.getText().equals("before")) {
                    oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in let FSQ = CS.getPost()->select(s | s.sat("+getOCL(ctx.getChild(3))+"))->asOrderedSet()->first() in if (FSQ.isDefined()) then (FSQ.getPre()-CS.getPre())->exists(s | s.sat("+getOCL(ctx.getChild(1))+")) else CS.getPost()->including(CS)->exists(s | s.sat("+getOCL(ctx.getChild(1))+")) endif";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
                else {
                    oclTranslation = "let CS:Snapshot = self.getCurrentSnapshot() in let LSQ = CS.getPre()->select(s | s.sat("+getOCL(ctx.getChild(3))+"))->asOrderedSet()->first() in if (LSQ.isDefined()) then (CS.getPre()->including(CS) - LSQ.getPre())->including(LSQ)->exists(s | s.sat("+getOCL(ctx.getChild(1))+")) else CS.getPre()->exists(s | s.sat("+getOCL(ctx.getChild(1))+")) endif";
                    stack.push(oclTranslation);
                    stack.push(origTocl);
                }
            }
        }

        public void exitPreviousExp(TOCLParser.PreviousExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            oclTranslation = "let CSPrev:Snapshot = self.getCurrentSnapshot().getPrevious() in CSPrev.isDefined() implies CSPrev.sat("+getOCL(ctx.getChild(1))+")";
            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void exitAlwaysPastExp(TOCLParser.AlwaysPastExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            oclTranslation = "self.getCurrentSnapshot().getPre()->forAll(s | s.sat("+getOCL(ctx.getChild(1))+"))";
            stack.push(oclTranslation);
            stack.push(origTocl);
        }

        public void exitSometimePastExp(TOCLParser.SometimePastExpContext ctx) { 
            TokenStream tokens = parser.getTokenStream(); 
            String oclTranslation = "";
            String origTocl = tokens.getText(ctx);
            oclTranslation = "self.getCurrentSnapshot().getPre()->exists(s | s.sat("+getOCL(ctx.getChild(1))+"))";
            stack.push(oclTranslation);
            stack.push(origTocl);
        }
    }

        
    public static String translate(File infile) {
        CharStream input = null;
        try {
            FileReader fileReader = new FileReader(infile.getAbsolutePath());
            input = CharStreams.fromReader(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        TOCLLexer lexer = new TOCLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TOCLParser parser = new TOCLParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expressionInOcl();

        ParseTreeWalker walker = new ParseTreeWalker();
        OCLEmitter converter = new OCLEmitter(parser);
        walker.walk(converter, tree);

        String inputFilePath = infile.getAbsolutePath();
        Integer fileExtensionIndex = inputFilePath.lastIndexOf('.');
        String outFilePath = inputFilePath.substring(0,fileExtensionIndex)+"STM.ocl";

        try {
            File oclFile = new File(outFilePath);
            if (oclFile.createNewFile()) {
              System.out.println("File created: " + oclFile.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          try {
            FileWriter oclWriter = new FileWriter(outFilePath);
            oclWriter.write(converter.getOCL(tree));
            oclWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        return converter.getOCL(tree);
    }
}
