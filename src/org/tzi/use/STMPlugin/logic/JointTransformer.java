package org.tzi.use.STMPlugin.logic;

import org.tzi.use.STMPlugin.logic.optimization.ModelOptimizer;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLTranslator;
import org.tzi.use.STMPlugin.logic.uml2stm.UMLTransformer;
import org.tzi.use.STMPlugin.logic.xml2use.XML2Classes;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class JointTransformer {
    public static Path transform(File umlFile) {
        return transform(umlFile, null, null);
    }

    public static Path transform(File umlFile, File toclFile) {
        return transform(umlFile, toclFile, null);
    }

    public static Path transform(File umlFile, File toclFile, String propertyForOptimization) {
        Path useFilePath = UMLTransformer.genSTM(umlFile).toPath();

        if (toclFile != null) {
            try {
                String toclTranslation = TOCLTranslator.translate(toclFile, XML2Classes.genClasses(umlFile));
                useFilePath = Files.write(useFilePath, toclTranslation.getBytes(), StandardOpenOption.APPEND);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (propertyForOptimization != null) {
            String translatedProperty = null;
            try {
                translatedProperty = TOCLTranslator.translate(propertyForOptimization, XML2Classes.genClasses(umlFile));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            useFilePath = ModelOptimizer.optimize(useFilePath.toFile(), translatedProperty).toPath();

        }

        return useFilePath;
    }
}
