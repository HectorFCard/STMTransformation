package org.tzi.use.STMPlugin;

import org.tzi.use.runtime.impl.Plugin;
import org.tzi.use.STMPlugin.logic.JointTransformer;

import java.io.File;

public class STMPlugin extends Plugin {
    protected final String PLUGIN_ID = "STMPlugin";

    @Override
    public String getName() {
        return PLUGIN_ID;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Must enter (1) input UML file and (2) input TOCL file");
            return;
        }

        String inputUMLFileName = args[0];
        String inputTOCLFileName = args[1];

        File inputUMLFile = new File(inputUMLFileName);
        File inputTOCLFile = new File(inputTOCLFileName);

        JointTransformer.transform(inputUMLFile, inputTOCLFile);
    }
}

