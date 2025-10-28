package com.bortnik.patterns.behavioral.command;

public class WriteCommand implements Command {
    private final Editor editor;
    private final String text;

    public WriteCommand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.write(text);
    }

    @Override
    public void undo() {
        editor.eraseLast(text.length());
    }
}
