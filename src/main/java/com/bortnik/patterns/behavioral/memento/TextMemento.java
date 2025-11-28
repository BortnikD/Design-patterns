package com.bortnik.patterns.behavioral.memento;

public record TextMemento(
        String text,
        int cursorPosition
) { }
