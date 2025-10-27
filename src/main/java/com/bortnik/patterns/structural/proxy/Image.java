package com.bortnik.patterns.structural.proxy;

public class Image implements Graphic {
    private final int width;
    private final int height;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Displaying image");
    }

    @Override
    public int getWidth() {
        System.out.println("Returning real image width");
        return width;
    }

    @Override
    public int getHeight() {
        System.out.println("Returning real image height");
        return height;
    }
}
