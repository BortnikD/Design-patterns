package com.bortnik.patterns.structural.bridge;

/**
 * The Bridge pattern allows you to reduce the number of hierarchies of a single class by splitting it into two
 * separate hierarchies, interconnected through a link in one of the resulting classes
 */
public class BridgeDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Bridge Pattern ===");

        Color red = new RedColor();
        System.out.println(red.applyColor());
        Shape square = new Square(red);
        System.out.println(square);

        Color blue = new BlueColor();
        System.out.println(blue.applyColor());
        Shape circle = new Square(blue);
        System.out.println(circle);
    }
}
