package org.tzi.use.STMPlugin;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintStream;

import org.tzi.use.STMPlugin.logic.JointTransformer;

import org.tzi.use.main.shell.runtime.IPluginShellCmd;
import org.tzi.use.runtime.shell.IPluginShellCmdDelegate;

import org.tzi.use.util.Log;

public class STMPluginCMD implements IPluginShellCmdDelegate {

    @Override
    public void performCommand(IPluginShellCmd pluginCommand) {
        PrintStream out = Log.out();
        if(!pluginCommand.getSession().hasSystem()) {
            out.println("No model loaded. The transformation is based on the currently loaded model. Please load a model.");
            return;
        }
        String[] arguments = pluginCommand.getCmdArgumentList();
        if (arguments.length < 2) {
            out.println("Must enter (1) input UML file and (2) input TOCL file");
            return;
        }

        String inputUMLFileName = arguments[0];
        String inputTOCLFileName = arguments[1];

        File inputUMLFile = new File(inputUMLFileName);
        File inputTOCLFile = new File(inputTOCLFileName);

        try {
            JointTransformer.transform(inputUMLFile, inputTOCLFile);
        }
        catch (FileNotFoundException e) {
            out.println("Could not open a file.");
            out.println(e.getMessage());
        }

    }
    
}
