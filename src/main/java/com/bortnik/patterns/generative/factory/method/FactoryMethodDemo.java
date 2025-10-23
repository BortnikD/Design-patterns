package com.bortnik.patterns.generative.factory.method;

/**
 * The Factory Method pattern is an official GoF pattern. This pattern requires more boilerplate code, due
 * to the creation of a large number of factories
 */
public class FactoryMethodDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Factory Method Pattern ===");

        MovableFactory catFactory = new CatFactory();
        Movable cat = catFactory.createMovable();
        cat.move();

        MovableFactory dogFactory = new DogFactory();
        Movable dog = dogFactory.createMovable();
        dog.move();
    }
}
