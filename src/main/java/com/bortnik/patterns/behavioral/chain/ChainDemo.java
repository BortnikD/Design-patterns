package com.bortnik.patterns.behavioral.chain;

/**
 * Chain of responsibility allows you to pass a request through a chain of handlers until one of them can process it
 */
public class ChainDemo {
    public static void demonstrate() {
        System.out.println("=== Chain of Responsibility Demo ===");

        Handler chain = HandlerFactory.createDefaultChain();

        System.out.println("\n--- Request 1: full access ---");
        chain.handle("auth admin data");

        System.out.println("\n--- Request 2: Unauthorized ---");
        chain.handle("admin data");

        System.out.println("\n--- Request 3: Only auth ---");
        chain.handle("auth");
    }
}
