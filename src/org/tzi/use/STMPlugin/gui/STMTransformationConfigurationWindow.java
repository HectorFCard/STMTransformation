package org.tzi.use.STMPlugin.gui;

import java.awt.GridBagLayout; //may consider changing
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory; //new
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import org.tzi.use.uml.mm.MModel;

public class STMTransformationConfigurationWindow extends JDialog {
    private static final long serialVersionUID = 1L;

    private JButton okButton;
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

        mainPanel.add(new JLabel("Enter .uml File:"),getGBC(row, 0));
        row++;

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK button clicked!");
            }
        });
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPanel.add(okButton, gbc);
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
