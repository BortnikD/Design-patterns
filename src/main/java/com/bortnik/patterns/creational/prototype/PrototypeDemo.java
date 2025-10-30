package com.bortnik.patterns.creational.prototype;

public class PrototypeDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Prototype Pattern ===");
        double x = 5;
        double y = 10;
        double radius = 15;

        var circle = new Circle(x, y, radius);

        var circleCopy = circle.clone();

        System.out.println("Circle is circleCopy? = " + (circle == circleCopy)); // false
        System.out.println("Circle equals circle copy? = " + circle.equals(circleCopy)); // true - copy
    }
}
