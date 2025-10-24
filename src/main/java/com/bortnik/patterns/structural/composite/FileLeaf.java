package com.bortnik.patterns.structural.composite;

public class FileLeaf implements FileSystemComponent {
    private final String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File = " + name);
    }
}
