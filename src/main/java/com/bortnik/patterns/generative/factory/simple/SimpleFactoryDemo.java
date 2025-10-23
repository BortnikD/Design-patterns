package com.bortnik.patterns.generative.factory.simple;

/**
 * A Simple factory is not an official GoF pattern, but it is the most common one
 */
public class SimpleFactoryDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Simple Factory Pattern ===");
        // Create a cat object without 'new' using the simple factory
        Movable cat = MovableFactory.createMovable("cat");
        cat.move();

        Movable dog = MovableFactory.createMovable("dog");
        dog.move();
    }
}
