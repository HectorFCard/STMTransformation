package org.tzi.use.STMPlugin.logic;

import org.tzi.use.STMPlugin.logic.optimization.ModelOptimizer;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLTranslator;
import org.tzi.use.STMPlugin.logic.uml2stm.UMLTransformer;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class JointTransformer {
    public static Path transform(File umlFile) {
        return transform(umlFile, null, false, null);
    }

    public static Path transform(File umlFile, File toclFile) {
        return transform(umlFile, toclFile, false, null);
    }

    public static Path transform(File umlFile, File toclFile, Boolean optimize, String propertyForOptimization) {
        File stmFile = UMLTransformer.genSTM(umlFile);
        Path useFilePath = null;

        if (toclFile != null) {
            String toclTranslation = TOCLTranslator.translate(toclFile);
            try {
                useFilePath = Files.write(stmFile.toPath(), toclTranslation.getBytes(), StandardOpenOption.APPEND);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (optimize) {
            String translatedProperty = TOCLTranslator.translate(propertyForOptimization);
            useFilePath = ModelOptimizer.optimize(useFilePath.toFile(), translatedProperty).toPath();
        }

        return useFilePath;
    }
}
