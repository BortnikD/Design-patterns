package com.bortnik.patterns.behavioral.command;

import java.util.Stack;

public class CommandInvoker {
    private final Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLast() {
        Command command = history.pop();
        command.undo();
    }
}
