package com.bortnik.patterns.structural.flyweight;

// Context
public class Tree {
    private final int x;
    private final int y;
    private final TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
        System.out.println("Tree created at (" + x + ", " + y + ")");
    }

    public void draw() {
        treeType.draw(x, y);
    }
}
