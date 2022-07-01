package org.tzi.use.STMPlugin.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout; //may consider changing
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Files;

import javax.swing.BorderFactory; //new
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import org.tzi.use.config.Options;
import org.tzi.use.gui.util.ExtFileFilter;
//import org.tzi.use.main.MainWindow;
import org.tzi.use.main.Session;
import org.tzi.use.uml.mm.MModel;
import org.tzi.use.uml.mm.ModelFactory;
import org.tzi.use.uml.sys.MSystem;
import org.tzi.use.parser.use.USECompiler;
import org.tzi.use.main.shell.Shell;

import org.tzi.use.STMPlugin.logic.xml2use.XML2USEConverter;
import org.tzi.use.STMPlugin.logic.JointTransformer;

public class STMTransformationConfigurationWindow extends JDialog {
    private static final long serialVersionUID = 1L;

    private JFileChooser fileChooserUML;
    private JFileChooser fileChooserTOCL;

    private JButton transformButton;
    private JButton cancelButton;

    private final Session fSession;

    public STMTransformationConfigurationWindow(final JFrame parent, final Session session, final MModel model) {
        super(parent, "STM Transformation Options");
        fSession = session;

        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //setResizable(false);

        //figure out what this does
        getRootPane().setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, getRootPane().getBackground()));

        //CREATING SUB-PANELS
        // Transform(sub-panel)
        JPanel transformPanel = new JPanel(new GridBagLayout());
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

        int subRow = 0;
        transformPanel.add(new JLabel("Enter .uml File:"),getGBC(subRow, 0));
        transformPanel.add(fileLabelUML, getGBC(subRow, 1));
        transformPanel.add(filechooserButtonUML, getGBC(subRow, 2));
        subRow++;

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

        transformPanel.add(new JLabel("Enter .tocl File:"),getGBC(subRow, 0));
        transformPanel.add(fileLabelTOCL, getGBC(subRow, 1));
        transformPanel.add(filechooserButtonTOCL, getGBC(subRow, 2));
        subRow++;

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

        GridBagConstraints gbc = new GridBagConstraints();
        buttonPanel.add(transformButton, gbc);
        buttonPanel.add(Box.createHorizontalStrut(5));//figure out what this means
        buttonPanel.add(cancelButton, gbc);
        transformPanel.add(buttonPanel, getGBC(subRow,0,3,1));
        subRow++;

        //END of Transform (only) sub-panel

        // Transform & Validate sub-panel
        CardLayout transValCard = new CardLayout();
        JPanel transValPanel = new JPanel(transValCard);

        JPanel transValPanel1 = new JPanel(new GridBagLayout());
        final JLabel fileLabelUMLTV = new FilePathLabel();
        fileLabelUMLTV.setPreferredSize(new Dimension(300,20));
        JButton filechooserButtonUMLTV = new JButton("Select");//consider adding image icon
        JFileChooser fileChooserUMLTV = new JFileChooser(Options.getLastDirectory().toFile());
        fileChooserUMLTV.setFileFilter(new ExtFileFilter("uml","UML Model in XMI"));
        fileChooserUMLTV.setDialogTitle("Choose save file");
        fileChooserUMLTV.setMultiSelectionEnabled(false);
        fileChooserUMLTV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals(JFileChooser.APPROVE_SELECTION)){
					fileLabelUMLTV.setText(fileChooserUMLTV.getSelectedFile().getAbsolutePath());
				}
			}
		});
        filechooserButtonUMLTV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooserUMLTV.showSaveDialog(STMTransformationConfigurationWindow.this);
			}
		});
        
        int TV1SubRow = 0;
        transValPanel1.add(new JLabel("Enter .uml File:"),getGBC(TV1SubRow, 0));
        transValPanel1.add(fileLabelUMLTV, getGBC(TV1SubRow, 1));
        transValPanel1.add(filechooserButtonUMLTV, getGBC(TV1SubRow, 2));
        TV1SubRow++;

        final JLabel fileLabelTOCLTV = new FilePathLabel();
        fileLabelTOCLTV.setPreferredSize(new Dimension(300,20));
        JButton filechooserButtonTOCLTV = new JButton("Select");//consider adding image icon
        JFileChooser fileChooserTOCLTV = new JFileChooser(Options.getLastDirectory().toFile());
        fileChooserTOCLTV.setFileFilter(new ExtFileFilter("tocl","TOCL Properties"));
        fileChooserTOCLTV.setDialogTitle("Choose save file");
        fileChooserTOCLTV.setMultiSelectionEnabled(false);
        fileChooserTOCLTV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals(JFileChooser.APPROVE_SELECTION)){
					fileLabelTOCLTV.setText(fileChooserTOCLTV.getSelectedFile().getAbsolutePath());
				}
			}
		});
        filechooserButtonTOCLTV.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooserTOCLTV.showSaveDialog(STMTransformationConfigurationWindow.this);
			}
		});

        transValPanel1.add(new JLabel("Enter .tocl File:"),getGBC(TV1SubRow, 0));
        transValPanel1.add(fileLabelTOCLTV, getGBC(TV1SubRow, 1));
        transValPanel1.add(filechooserButtonTOCLTV, getGBC(TV1SubRow, 2));
        TV1SubRow++;

        //Choosing configuration method
        JPanel uploadPropPanel = new JPanel(new GridBagLayout());

        final JLabel propFileLabel = new FilePathLabel();
        propFileLabel.setPreferredSize(new Dimension(300,20));
        JButton propfilechooserButton = new JButton("Select");//consider adding image icon
        JFileChooser propFileChooser = new JFileChooser(Options.getLastDirectory().toFile());
        propFileChooser.setFileFilter(new ExtFileFilter("properties","Configuration File"));
        propFileChooser.setDialogTitle("Choose configuration file");
        propFileChooser.setMultiSelectionEnabled(false);
        propFileChooser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals(JFileChooser.APPROVE_SELECTION)){
					propFileLabel.setText(propFileChooser.getSelectedFile().getAbsolutePath());
				}
			}
		});
        propfilechooserButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				propFileChooser.showSaveDialog(STMTransformationConfigurationWindow.this);
			}
		});

        uploadPropPanel.add(new JLabel("Enter .properties File:"),getGBC(0, 0));
        uploadPropPanel.add(propFileLabel, getGBC(0, 1));
        uploadPropPanel.add(propfilechooserButton, getGBC(0, 2));

        final JComboBox<String> configMethod = new JComboBox<String>(new String[]{ "Create configuration", "Upload .properties file"});
        configMethod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Upload .properties file".equals(configMethod.getSelectedItem())) {
                    transValPanel1.add(uploadPropPanel,getGBC(3,0,4,1));
                    pack();
                }
                else {
                    transValPanel1.remove(uploadPropPanel);
                    pack();
                }
            }
        });

        JPanel configMethodPanel = new JPanel();
        transValPanel1.add(new JLabel("Configuration method:"),getGBC(TV1SubRow, 0));
        transValPanel1.add(configMethod,getGBC(TV1SubRow, 1));
        //End of choosing configuration method
        TV1SubRow++;
        TV1SubRow++;

        JCheckBox transformFiles = new JCheckBox("Create transformation files");
        transformFiles.setSelected(true);
        transformFiles.setToolTipText("<html>Creates transformation files from the inputted .uml and .tocl files</html>");
        transValPanel1.add(transformFiles, getGBC(TV1SubRow, 0));
        TV1SubRow++;

        JPanel buttonPanelTV = new JPanel(new GridBagLayout());
        JButton transformButtonTV = new JButton("Transform");
        transformButtonTV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File fUML = fileChooserUMLTV.getSelectedFile();
                File fTOCL = fileChooserTOCLTV.getSelectedFile();
                //add something for checkbox
                if (fUML == null) {
                    JOptionPane.showMessageDialog(STMTransformationConfigurationWindow.this, "Please select a UML file!", "No File", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (fTOCL == null) { //consider modifying
                    JOptionPane.showMessageDialog(STMTransformationConfigurationWindow.this, "Please select a TOCL file!", "No File", JOptionPane.ERROR_MESSAGE);
                }
                
                Path fileCreated = JointTransformer.transform(fUML, fTOCL);
                if (Files.exists(fileCreated)) {
                    System.out.println(fileCreated.getFileName());
                    System.out.println("compiling specification " + fileCreated.toString() + "...");
                    PrintWriter logWriter = new PrintWriter(System.out);
                    MModel model = null;
                    try (InputStream iStream = Files.newInputStream(fileCreated)) {
                        model = USECompiler.compileSpecification(iStream, fileCreated.toAbsolutePath().toString(), logWriter, new ModelFactory());
                        System.out.println("done.");
                    } catch(IOException ex) {
                        System.out.println("File `" + fileCreated.toAbsolutePath().toString() + "' not found.");
                    }

                    final MSystem system;
                    if (model != null) {
                        System.out.println(model.getStats());
                        system = new MSystem(model);
                    } else {
                        system = null;
                    }
                    
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            fSession.setSystem(system);
                        }
                    });

                    Shell shell = Shell.getInstance();

                    if ("Upload .properties file".equals(configMethod.getSelectedItem())) {
                        shell.processLineSafely("mv -validate "+propFileChooser.getSelectedFile().toString());
                    }
                    else {
                        shell.processLineSafely("mv -validate");
                    }   
                }
            }
        });
        JButton cancelButtonTV = new JButton("Cancel");
        cancelButtonTV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPanelTV.add(transformButtonTV, gbc);
        buttonPanelTV.add(Box.createHorizontalStrut(5));//figure out what this means
        buttonPanelTV.add(cancelButtonTV, gbc);
        transValPanel1.add(buttonPanelTV, getGBC(TV1SubRow,0,3,1));
        TV1SubRow++;

        JLabel pageNum = new JLabel("1 of 2");
        pageNum.setForeground(Color.GRAY);
        transValPanel1.add(pageNum,getGBC(TV1SubRow, 1));
        transValPanel.add("1",transValPanel1);

        JPanel transValPanel2 = new JPanel(new GridBagLayout());

        //END of Transform & Validate sub-panel

        //START of Transform XMI to USE
        JPanel XMI2USEpanel = new JPanel(new GridBagLayout());

        final JLabel fileLabelXMI2USE = new FilePathLabel();
        fileLabelXMI2USE.setPreferredSize(new Dimension(300,20));
        JButton filechooserButtonXMI2USE = new JButton("Select");//consider adding image icon
        JFileChooser fileChooserXMI2USE = new JFileChooser(Options.getLastDirectory().toFile());
        fileChooserXMI2USE.setFileFilter(new ExtFileFilter("uml","UML Model in XMI"));
        fileChooserXMI2USE.setDialogTitle("Choose save file");
        fileChooserXMI2USE.setMultiSelectionEnabled(false);
        fileChooserXMI2USE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals(JFileChooser.APPROVE_SELECTION)){
					fileLabelXMI2USE.setText(fileChooserXMI2USE.getSelectedFile().getAbsolutePath());
				}
			}
		});
        filechooserButtonXMI2USE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooserXMI2USE.showSaveDialog(STMTransformationConfigurationWindow.this);
			}
		});
        
        int XMI2USERow = 0;
        XMI2USEpanel.add(new JLabel("Enter .uml File:"),getGBC(XMI2USERow, 0));
        XMI2USEpanel.add(fileLabelXMI2USE, getGBC(XMI2USERow, 1));
        XMI2USEpanel.add(filechooserButtonXMI2USE, getGBC(XMI2USERow, 2));
        XMI2USERow++;

        JCheckBox loadModel = new JCheckBox("Load model after transformation");
        loadModel.setSelected(false);
        loadModel.setToolTipText("<html>Loads the model to USE after it is transformed</html>");
        XMI2USEpanel.add(loadModel, getGBC(XMI2USERow, 0));
        XMI2USERow++;

        JPanel buttonPanelXMI2USE = new JPanel(new GridBagLayout());
        JButton transformButtonXMI2USE = new JButton("Transform");
        transformButtonXMI2USE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File fUML = fileChooserXMI2USE.getSelectedFile();
                //add something for checkbox
                if (fUML == null) {
                    JOptionPane.showMessageDialog(STMTransformationConfigurationWindow.this, "Please select a UML file!", "No File", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                File fileGenerated = null;

                try {
                    fileGenerated = XML2USEConverter.genUseSpec(fUML);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                
                if (loadModel.isSelected()) {
                    if (fileGenerated.exists()) {
                        //System.out.println(fileGenerated.getFileName());
                        System.out.println("compiling specification " + fileGenerated.toString() + "...");
                        PrintWriter logWriter = new PrintWriter(System.out);
                        MModel model = null;
                        try (InputStream iStream = Files.newInputStream(fileGenerated.toPath())) {
                            model = USECompiler.compileSpecification(iStream, fileGenerated.toString(), logWriter, new ModelFactory());
                            System.out.println("done.");
                        } catch(IOException ex) {
                            System.out.println("File `" + fileGenerated.toString() + "' not found.");
                        }
    
                        final MSystem system;
                        if (model != null) {
                            System.out.println(model.getStats());
                            system = new MSystem(model);
                        } else {
                            system = null;
                        }
                        
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                fSession.setSystem(system);
                            }
                        });
                    }
                }
            }
        });
        JButton cancelButtonXMI2USE = new JButton("Cancel");
        cancelButtonXMI2USE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPanelXMI2USE.add(transformButtonXMI2USE, gbc);
        buttonPanelXMI2USE.add(Box.createHorizontalStrut(5));//figure out what this means
        buttonPanelXMI2USE.add(cancelButtonXMI2USE, gbc);
        XMI2USEpanel.add(buttonPanelXMI2USE, getGBC(XMI2USERow,0,3,1));
        XMI2USERow++;

        //END of Transform XMI to USE

        CardLayout cardLay = new CardLayout();
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel focusPanel = new JPanel(cardLay);
        //int row = 0;

        final JComboBox<String> actionChoice = new JComboBox<String>(new String[]{ "Transform", "Transform & Validate", "Convert XMI to USE file"});
        actionChoice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Transform & Validate".equals(actionChoice.getSelectedItem())) {
                    /*System.out.println("transforming and validating");
                    mainPanel.remove(transformPanel);
                    mainPanel.add(transValPanel1,getGBC(1,1));
                    pack();*/
                    cardLay.show(focusPanel,"trans&val");
                }
                else if ("Convert XMI to USE file".equals(actionChoice.getSelectedItem())) {
                    cardLay.show(focusPanel,"xmi2use");
                }
                else {
                    /*mainPanel.remove(transValPanel1);
                    mainPanel.add(transformPanel,getGBC(1,1));
                    pack();*/
                    cardLay.show(focusPanel,"trans");
                }
            }
        });

        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.add(new JLabel("Transformation method:"),BorderLayout.WEST);
        comboBoxPanel.add(actionChoice,BorderLayout.EAST);

        //row++;
        focusPanel.add("trans",transformPanel);
        focusPanel.add("trans&val",transValPanel);
        focusPanel.add("xmi2use",XMI2USEpanel);

        mainPanel.add(comboBoxPanel,BorderLayout.NORTH);
        mainPanel.add(focusPanel,BorderLayout.SOUTH);

        
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
