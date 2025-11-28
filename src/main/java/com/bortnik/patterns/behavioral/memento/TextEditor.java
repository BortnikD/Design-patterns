package com.bortnik.patterns.behavioral.memento;

public class TextEditor {
    private String text = "";
    private int cursorPosition;

    public void write(String newText) {
        this.text += newText;
        this.cursorPosition = text.length();
    }

    public TextMemento save() {
        return new TextMemento(text, cursorPosition);
    }

    public void restore(TextMemento memento) {
        this.text = memento.text();
        this.cursorPosition = memento.cursorPosition();
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "text='" + text + '\'' +
                ", cursorPosition=" + cursorPosition +
                '}';
    }
}
