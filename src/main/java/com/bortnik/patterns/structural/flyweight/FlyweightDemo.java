package com.bortnik.patterns.structural.flyweight;

/**
 * The flyweight pattern provides memory optimization using flyweight objects, they store shared data;
 * we also have context classes that store unique data and pass it to flyweight objects
 */
public class FlyweightDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Flyweight Pattern ===");
        Forest forest = new Forest();

        forest.plantTree(1, 1, "Oak", "Green", "rough bark");
        forest.plantTree(2, 3, "Oak", "Green", "rough bark");
        forest.plantTree(5, 8, "Birch tree", "Light-green", "smooth bark");
        forest.plantTree(7, 2, "Oak", "Green", "rough bark");

        forest.draw();
    }
}
