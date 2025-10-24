package com.bortnik.patterns.generative.prototype;

public class Circle implements Cloneable {
    private final double x;
    private final double y;
    private final double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // official java.lang.Cloneable
    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Also, we can do it like this
//    private Circle(Circle circle) {
//        x = circle.x;
//        y = circle.y;
//        radius = circle.radius;
//    }
//
//    public Circle clone() {
//        return new Circle(this);
//    }

    public boolean equals(Object object) {
        if (!(object instanceof Circle circle)) {
            return false;
        }
        return circle.x == x && circle.y == y && circle.radius == radius;
    }
}
