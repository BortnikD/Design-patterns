package com.bortnik.patterns.behavioral.interpreter;

/**
 * The Interpreter pattern is needed to create and process your own mini-languages.
 * It allows you to describe rules and interpret expressions.
 */
public class InterpreterDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Interpreter Pattern ===");
        Expression expr = new OrExpression(
                new AndExpression(
                        new Constant(true),
                        new Constant(false)
                ),
                new Constant(true)
        );

        System.out.println("Result: " + expr.interpret()); // true
    }
}
