package com.bortnik.patterns.structural.bridge;

public abstract class Shape {
    protected final Color color; // The 'bridge'

    public Shape(Color color) {
        this.color = color;
    }
}
