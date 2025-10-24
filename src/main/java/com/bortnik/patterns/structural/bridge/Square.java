package com.bortnik.patterns.structural.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public String toString() {
        return "Square(color=" + color + ")";
    }
}
