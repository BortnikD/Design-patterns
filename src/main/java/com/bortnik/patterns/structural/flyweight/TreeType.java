package com.bortnik.patterns.structural.flyweight;

// Flyweight
public class TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing tree [" + name + "] with color " + color +
                " and texture " + texture + " on coordinates (" + x + ", " + y + ")");
    }
}
