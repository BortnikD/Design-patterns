package com.bortnik.patterns.structural.bridge;

public class BlueColor implements Color {
    @Override
    public String applyColor() {
        return "blue";
    }

    public String toString() {
        return "BlueColor()";
    }
}
