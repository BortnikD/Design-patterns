package com.bortnik.patterns.behavioral.memento;

import java.util.Stack;

public class EditorHistory {
    private final Stack<TextMemento> history = new Stack<>();

    public void save(TextEditor textEditor) {
        history.push(textEditor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }


}
