package org.tzi.use.STMPlugin.gui;

import javax.swing.JDialog;
import javax.swing.JFrame;

import org.tzi.use.uml.mm.MModel;

public class STMTransformationConfigurationWindow extends JDialog {
    private static final long serialVersionUID = 1L;

    public STMTransformationConfigurationWindow(final JFrame parent, final MModel model) {
        super(parent, "STM Transformation Options");
    }
    
    //setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
