package com.bortnik.patterns.structural.bridge;

public class RedColor implements Color {
    @Override
    public String applyColor() {
        return "red";
    }

    public String toString() {
        return "RedColor()";
    }
}
