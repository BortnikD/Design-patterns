package com.bortnik.patterns.structural.decorator;

/**
 * The Decorator pattern provides a change in the behavior of an object
 * by creating a new object based on the original object
 */
public class DecoratorDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Decorator Pattern ===");

        // Original coffee object
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());

        // Wrap on the coffee object, changing behavior, but not changing the original object
        Coffee milkCoffee = new MilkCoffeeDecorator(coffee);
        System.out.println(milkCoffee.getDescription() + " costs " + milkCoffee.getCost());

        // The original object has not changed
        System.out.println(coffee.getDescription() + " costs " + coffee.getCost());
    }
}
