package org.tzi.use.STMPlugin;

import java.io.PrintStream;

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
    }
    
}
