package org.tzi.use.STMPlugin.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLLexer;
import org.tzi.use.STMPlugin.logic.tocl2ocl.TOCLParser;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Vector;

public class AddTOCLDialog extends JDialog  {

    private final JTextArea toclProperties;

    private final JTextArea feedBack;

    private final Vector<String> toclPropertyList = new Vector<String>();

    //private File toclFile;

    //private final JButton addButton;

    //private final JButton helpButton;

    AddTOCLDialog(JDialog parent) {
        super(parent, "Write TOCL Properties");

        setDefaultCloseOperation(HIDE_ON_CLOSE);

        toclProperties = new JTextArea();
        JLabel addTOCL = new JLabel("Enter TOCL temporal properties:");
        addTOCL.setLabelFor(toclProperties);

        feedBack = new JTextArea();
        JLabel feedBackLabel = new JLabel("Feedback:");
        feedBackLabel.setLabelFor(feedBack);
        feedBack.setEditable(false);
        feedBack.setLineWrap(true);

        JPanel textInPanel = new JPanel(new BorderLayout());
        textInPanel.add(addTOCL,BorderLayout.NORTH);
        textInPanel.add(new JScrollPane(toclProperties),BorderLayout.CENTER);

        JPanel textOutPanel = new JPanel(new BorderLayout());
        textOutPanel.add(feedBackLabel,BorderLayout.NORTH);
        textOutPanel.add(new JScrollPane(feedBack),BorderLayout.CENTER);
        //feedBack.setText("context [Class]\ninv:\n[TOCL expression]");
        //\n\nExample:\ncontext Button\ninv buttonPushed:\nself.pushed() implies next self.door.state = #Open

        JPanel textPane = new JPanel();
        textPane.setLayout(new BoxLayout(textPane, BoxLayout.Y_AXIS));
        textPane.add(textInPanel);
        textPane.add(Box.createRigidArea(new Dimension(0, 5)));
        textPane.add(textOutPanel);
        textPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        //creating buttons
        JButton addBtn = new JButton("Add");
        addBtn.setToolTipText("Add a tocl property to be transformed");
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CharStream input = null;
                input = CharStreams.fromString(toclProperties.getText());
                TOCLLexer lexer = new TOCLLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                TOCLParser parser = new TOCLParser(tokens);
                AddTOCLErrorListener parserErrorListener = new AddTOCLErrorListener(feedBack);
                AddTOCLErrorListener lexerErrorListener = new AddTOCLErrorListener(feedBack);
                parser.removeErrorListeners(); // remove ConsoleErrorListener
                parser.addErrorListener(parserErrorListener); // add ours
                lexer.removeErrorListeners();
                lexer.addErrorListener(lexerErrorListener);
                parser.expressionInOcl();
                
                if (!(parserErrorListener.getErrorResult() || lexerErrorListener.getErrorResult())) { //handle lexer error
                    feedBack.setText("Success!\n");
                    toclPropertyList.add(toclProperties.getText());
                }               
            }
        });

        JButton showAllBtn = new JButton("Show All");
        showAllBtn.setToolTipText("Show all tocl properties that have been added");
        showAllBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                feedBack.setText(null);
                for (int i = 0; i<toclPropertyList.size(); i++) {
                    feedBack.append(toclPropertyList.elementAt(i)+"\n");
                }        
            }
        });

        JButton clearPrevBtn = new JButton("Clear All Additions");
        clearPrevBtn.setToolTipText("Clears all the TOCL temporal properties that have been added");
        clearPrevBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add pop up window that asks user if they are sure they want to clear previous additions
                toclPropertyList.clear();
            }
        });

        JButton helpBtn = new JButton("Help");
        helpBtn.setToolTipText("Help on how to write TOCL temporal properties");

        JButton saveBtn = new JButton("Save to File");
        saveBtn.setToolTipText("Choose a file to save TOCL temporal properties to");

        JButton closeBtn = new JButton("Close");
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();       
            }
        });

        JPanel btnPane = new JPanel();
        btnPane.setLayout(new BoxLayout(btnPane, BoxLayout.Y_AXIS));
        btnPane.add(addBtn);
        btnPane.add(Box.createRigidArea(new Dimension(0,5)));
        btnPane.add(showAllBtn);
        btnPane.add(Box.createRigidArea(new Dimension(0,5)));
        btnPane.add(clearPrevBtn);
        btnPane.add(Box.createRigidArea(new Dimension(0,5)));
        btnPane.add(helpBtn);
        btnPane.add(Box.createRigidArea(new Dimension(0,5)));
        btnPane.add(saveBtn);
        btnPane.add(Box.createRigidArea(new Dimension(0,5)));
        btnPane.add(closeBtn);

        JComponent contentPane = (JComponent) getContentPane();
        contentPane.add(textPane,BorderLayout.CENTER);
        contentPane.add(btnPane,BorderLayout.EAST);
        


        pack();
        setSize(new Dimension(500,250));
        setLocationRelativeTo(parent);


    }

    public Vector<String> getTOCLProperties() {
        return toclPropertyList;
    }
}



//add a log
//when adding tocl properties, parse them to make sure they're actual TOCL
//out error message and direct to "HELP"
//buttons: Add, Add to Previous, Show All TOCL, Save to File, Help, Close
//when closing save file to the original window

//in main window file, if a file has been previously created in the same session,
//ask if user wants to add to existing TOCL properties or start a new.