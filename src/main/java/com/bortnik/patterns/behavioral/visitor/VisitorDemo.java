package com.bortnik.patterns.behavioral.visitor;

/**
 * Demonstrates the Visitor design pattern with shapes and area calculation.
 */
public class VisitorDemo {
    public static void demonstrate() {
        System.out.println("=== Visitor Demo ===");
        Shape circle = new Circle(5);
        Shape rect = new Rectangle(4, 6);

        Visitor areaVisitor = new AreaCalculator();

        circle.accept(areaVisitor);
        rect.accept(areaVisitor);
    }
}
