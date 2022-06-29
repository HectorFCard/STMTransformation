package org.tzi.use.STMPlugin.logic;

import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLTranslator;
import org.tzi.use.STMPlugin.logic.uml2stm.UMLTransformer;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class JointTransformer {
    public static Path transform(File umlFile, File toclFile) {
        File stmFile = UMLTransformer.genSTM(umlFile);
        String toclTranslation = TOCLTranslator.translate(toclFile);
        Path fileCreated = null;

        try {
            fileCreated = Files.write(stmFile.toPath(), toclTranslation.getBytes(), StandardOpenOption.APPEND);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return fileCreated;
    }
}
