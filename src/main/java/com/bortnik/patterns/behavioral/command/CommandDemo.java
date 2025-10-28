package com.bortnik.patterns.behavioral.command;

/**
 * The Command pattern allows you to transform a request into an object that encapsulates the request.
 * This allows you to separate the invoker from the recipient and manage requests - execute, cancel, log
 */
public class CommandDemo {
    public static void demonstrate() {
        System.out.println("=== Command Pattern Demo ===");

        Editor editor = new Editor();
        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(new WriteCommand(editor, "Hello, "));
        invoker.executeCommand(new WriteCommand(editor, "World!"));
        invoker.undoLast();
    }
}
