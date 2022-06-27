package org.tzi.use.STMPlugin.gui;

import java.awt.Dimension;
import java.awt.GridBagLayout; //may consider changing
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory; //new
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import org.tzi.use.config.Options;
import org.tzi.use.gui.util.ExtFileFilter;
import org.tzi.use.uml.mm.MModel;

import org.tzi.use.STMPlugin.logic.JointTransformer;

public class STMTransformationConfigurationWindow extends JDialog {
    private static final long serialVersionUID = 1L;

    private JFileChooser fileChooserUML;
    private JFileChooser fileChooserTOCL;

    private JButton transformButton;
    private JButton cancelButton;

    public STMTransformationConfigurationWindow(final JFrame parent, final MModel model) {
        super(parent, "STM Transformation Options");

        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //setResizable(false);

        //figure out what this does
        getRootPane().setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, getRootPane().getBackground()));


        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        int row = 0;

        final JLabel fileLabelUML = new FilePathLabel();
        fileLabelUML.setPreferredSize(new Dimension(300,20));
        JButton filechooserButtonUML = new JButton("Select");//consider adding image icon
        fileChooserUML = new JFileChooser(Options.getLastDirectory().toFile());
        fileChooserUML.setFileFilter(new ExtFileFilter("uml","UML Model in XMI"));
        fileChooserUML.setDialogTitle("Choose save file");
        fileChooserUML.setMultiSelectionEnabled(false);
        fileChooserUML.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals(JFileChooser.APPROVE_SELECTION)){
					fileLabelUML.setText(fileChooserUML.getSelectedFile().getAbsolutePath());
				}
			}
		});
        filechooserButtonUML.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooserUML.showSaveDialog(STMTransformationConfigurationWindow.this);
			}
		});

        mainPanel.add(new JLabel("Enter .uml File:"),getGBC(row, 0));
        mainPanel.add(fileLabelUML, getGBC(row, 1));
        mainPanel.add(filechooserButtonUML, getGBC(row, 2));
        row++;

        final JLabel fileLabelTOCL = new FilePathLabel();
        fileLabelTOCL.setPreferredSize(new Dimension(300,20));
        JButton filechooserButtonTOCL = new JButton("Select");//consider adding image icon
        fileChooserTOCL = new JFileChooser(Options.getLastDirectory().toFile());
        fileChooserTOCL.setFileFilter(new ExtFileFilter("tocl","TOCL Properties"));
        fileChooserTOCL.setDialogTitle("Choose save file");
        fileChooserTOCL.setMultiSelectionEnabled(false);
        fileChooserTOCL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals(JFileChooser.APPROVE_SELECTION)){
					fileLabelTOCL.setText(fileChooserTOCL.getSelectedFile().getAbsolutePath());
				}
			}
		});
        filechooserButtonTOCL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooserTOCL.showSaveDialog(STMTransformationConfigurationWindow.this);
			}
		});

        mainPanel.add(new JLabel("Enter .tocl File:"),getGBC(row, 0));
        mainPanel.add(fileLabelTOCL, getGBC(row, 1));
        mainPanel.add(filechooserButtonTOCL, getGBC(row, 2));
        row++;

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        transformButton = new JButton("Transform");
        transformButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File fUML = fileChooserUML.getSelectedFile();
                File fTOCL = fileChooserTOCL.getSelectedFile();
                if (fUML == null) {
                    JOptionPane.showMessageDialog(STMTransformationConfigurationWindow.this, "Please select a UML file!", "No File", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (fTOCL == null) { //consider modifying
                    JOptionPane.showMessageDialog(STMTransformationConfigurationWindow.this, "Please select a TOCL file!", "No File", JOptionPane.ERROR_MESSAGE);
                }
                
                dispose();
                JointTransformer.transform(fUML, fTOCL);
            }
        });
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPanel.add(transformButton, gbc);
        buttonPanel.add(Box.createHorizontalStrut(5));//figure out what this means
        buttonPanel.add(cancelButton, gbc);
        mainPanel.add(buttonPanel, getGBC(row,0,3,1));

        setContentPane(mainPanel);

        pack();
        setLocationRelativeTo(parent);
        setVisible(true);
    }
    private GridBagConstraints getGBC(int row, int col){
		return getGBC(row, col, 1, 1);
	}
	
	private GridBagConstraints getGBC(int row, int col, int gridWidth, int gridHeigh) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = col;
		gbc.gridy = row;
		gbc.gridwidth = gridWidth;
		gbc.gridheight = gridHeigh;
		gbc.insets.top = (row==0)?0:5;
		gbc.insets.left = (col>0)?5:0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		return gbc;
	}

    
}
