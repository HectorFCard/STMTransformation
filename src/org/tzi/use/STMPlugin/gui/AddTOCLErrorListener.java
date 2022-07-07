package org.tzi.use.STMPlugin.gui;

import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.misc.Nullable;

import javax.swing.JTextArea;

public class AddTOCLErrorListener extends BaseErrorListener {
    private final JTextArea outputLocation;
    private boolean errorFree = true;

    AddTOCLErrorListener(JTextArea outputLog) {
        outputLocation = outputLog;
    }
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        outputLocation.setText("line "+line+":"+charPositionInLine+" at "+
                           offendingSymbol+": "+msg);
                           errorFree = false;
    }

    public void resetErrorResult() {
        errorFree = true;
    }

    public boolean getErrorResult() {
        return errorFree;
    }

}
