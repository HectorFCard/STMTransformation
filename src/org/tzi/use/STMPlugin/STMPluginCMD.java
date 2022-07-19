package org.tzi.use.STMPlugin;

import java.io.*;
import java.nio.file.Files;

import org.tzi.use.STMPlugin.logic.JointTransformer;

import org.tzi.use.STMPlugin.logic.xml2use.XML2USEConverter;
import org.tzi.use.main.Session;
import org.tzi.use.main.shell.runtime.IPluginShellCmd;
import org.tzi.use.parser.use.USECompiler;
import org.tzi.use.runtime.shell.IPluginShellCmdDelegate;

import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.ModelFactory;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.util.Log;

public class STMPluginCMD implements IPluginShellCmdDelegate {

    @Override
    public void performCommand(IPluginShellCmd pluginCommand) {
        switch (pluginCommand.getCmd()) {
            case "stmTransform" -> {
                PrintStream out = Log.out();
                if (!pluginCommand.getSession().hasSystem()) {
                    out.println("No model loaded. The transformation is based on the currently loaded model. Please load a model.");
                    return;
                }
                String[] arguments = pluginCommand.getCmdArgumentList();
                Boolean optimize = arguments.length > 3 && Boolean.parseBoolean(arguments[2]);

                if (arguments.length < 1) {
                    out.println("Must at least enter an input file containing a UML class diagram");
                    return;
                }

                File inputUMLFile = new File(arguments[0]);
                File inputTOCLFile = arguments.length > 1 ? new File(arguments[1]) : null;

                JointTransformer.transform(inputUMLFile, inputTOCLFile, optimize ? arguments[3] : null);
            }
            case "loadXmi" -> {
                PrintStream out = Log.out();
                String[] arguments = pluginCommand.getCmdArgumentList();
                if (arguments.length < 1) {
                    out.println("Please enter an XMI file containing a UML class diagram");
                    return;
                }
                File useFile = null;
                try {
                    useFile = XML2USEConverter.genUseSpec(new File(arguments[0]));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loadSystem(useFile, pluginCommand.getSession());
            }
        }
    }

    private void loadSystem(File useFile, Session session) {
        if (Files.exists(useFile.toPath())) {
            System.out.println("compiling specification " + useFile.toString() + "...");
            PrintWriter logWriter = new PrintWriter(System.out);
            MModel model = null;
            try (InputStream iStream = Files.newInputStream(useFile.toPath())) {
                model = USECompiler.compileSpecification(iStream, useFile.getAbsolutePath(), logWriter, new ModelFactory());
                System.out.println("done.");
            } catch(IOException ex) {
                System.out.println("File `" + useFile.getAbsolutePath() + "' not found.");
            }

            final MSystem system;
            if (model != null) {
                System.out.println(model.getStats());
                system = new MSystem(model);
            } else {
                system = null;
            }

            session.setSystem(system);
        }
    }
}
