package com.bortnik.patterns.structural.proxy;

/**
 * The Proxy pattern provides optimization using lazy initialization
 */
public class ProxyDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Proxy Pattern ===");
        Document document = new Document();

        ImageProxy image1 = new ImageProxy(10, 20);
        System.out.println("Image 1 width: " + image1.getWidth());
        System.out.println("Image 1 height: " + image1.getHeight());

        document.addImage(image1);

        ImageProxy image2 = new ImageProxy(100, 200);
        System.out.println("Image 2 width: " + image2.getWidth());
        System.out.println("Image 2 height: " + image2.getHeight());

        document.addImage(image2);
        document.draw();

        System.out.println("Real image 1 width: " + image1.getWidth());
        System.out.println("Real image 1 height: " + image1.getHeight());
    }
}
