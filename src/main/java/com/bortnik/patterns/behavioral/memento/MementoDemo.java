package com.bortnik.patterns.behavioral.memento;

/**
 * Tme memento pattern demo
 */
public class MementoDemo {
    public static void demonstrate() {
        System.out.println("=== Memento Pattern Demo ===");
        TextEditor textEditor = new TextEditor();
        EditorHistory editorHistory = new EditorHistory();

        textEditor.write("Hello");
        System.out.println("Current state: " + textEditor);
        editorHistory.save(textEditor);

        textEditor.write("World");
        System.out.println("Current state: " + textEditor);
        editorHistory.save(textEditor);

        textEditor.write("!");
        System.out.println("Current state: " + textEditor);
        editorHistory.save(textEditor);

        textEditor.write(" madamada");
        System.out.println("Current state (not save): " + textEditor);

        System.out.println("\n--- Performing Undo ---");

        editorHistory.undo(textEditor);
        System.out.println("After first undo: " + textEditor);

        editorHistory.undo(textEditor);
        System.out.println("After second undo: " + textEditor);

        editorHistory.undo(textEditor);
        System.out.println("After third undo: " + textEditor);
    }
}
