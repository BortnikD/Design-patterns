package com.bortnik.patterns.structural.proxy;

public class ImageProxy implements Graphic {
    private Image image;
    private final int width;
    private final int height;

    public ImageProxy(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        if (image == null) {
            System.out.println("Creating real image on demand...");
            image = new Image(width, height);
        }
        image.draw();
    }

    @Override
    public int getWidth() {
        return image == null ? width : image.getWidth();
    }

    @Override
    public int getHeight() {
        return image == null ? height : image.getHeight();
    }
}
