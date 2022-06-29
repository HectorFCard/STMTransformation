package org.tzi.use.STMPlugin;

import javax.swing.JOptionPane;

import org.tzi.use.gui.main.MainWindow;
import org.tzi.use.STMPlugin.gui.STMTransformationConfigurationWindow;
import org.tzi.use.runtime.gui.IPluginAction;
import org.tzi.use.runtime.gui.IPluginActionDelegate;

public class STMPluginAction implements IPluginActionDelegate {
    @Override
    public void performAction(IPluginAction pluginAction) {
        if(!pluginAction.getSession().hasSystem()){
            JOptionPane.showMessageDialog(pluginAction.getParent(), 
                                        "No model loaded",
                                        "No Model", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.out.print("Creating configuration window");
        new STMTransformationConfigurationWindow(MainWindow.instance(), pluginAction.getSession(), pluginAction.getSession().system().model());
    }
    
}
