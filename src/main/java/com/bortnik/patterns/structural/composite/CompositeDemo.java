package com.bortnik.patterns.structural.composite;

/**
 * The Composite pattern allows you to group sets into a single tree-like structure and use it as a single object.
 */
public class CompositeDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Composite Pattern ===");
        FileLeaf file1 = new FileLeaf("photo.jpg");
        FileLeaf file2 = new FileLeaf("video.mp4");
        FileLeaf file3 = new FileLeaf("document.txt");

        DirectoryComposite images = new DirectoryComposite("Images");
        DirectoryComposite videos = new DirectoryComposite("Videos");

        images.addChild(file1);
        videos.addChild(file2);

        DirectoryComposite root = new DirectoryComposite("Root");
        root.addChild(images);
        root.addChild(videos);
        root.addChild(file3);

        root.showDetails();
    }
}
