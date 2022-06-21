package org.tzi.use.STMPlugin.logic;

import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLTranslator;
import org.tzi.use.STMPlugin.logic.uml2stm.UMLTransformer;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class JointTransformer {
    public static void transform(File umlFile, File toclFile) {
        File stmFile = UMLTransformer.genSTM(umlFile);
        String toclTranslation = TOCLTranslator.translate(toclFile);

        try {
            Files.write(stmFile.toPath(), toclTranslation.getBytes(), StandardOpenOption.APPEND);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
