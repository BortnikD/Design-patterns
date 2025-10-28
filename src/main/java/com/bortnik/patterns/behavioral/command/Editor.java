package com.bortnik.patterns.behavioral.command;

// Receiver
public class Editor {
    private String text = "";

    public void write(String newText) {
        text += newText;
        System.out.println("Text: " + text);
    }

    public void eraseLast(int length) {
        text = text.substring(0, Math.max(0, text.length() - length));
        System.out.println("Undo Text: " + text);
    }
}
