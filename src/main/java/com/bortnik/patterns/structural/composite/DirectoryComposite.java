package com.bortnik.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    public DirectoryComposite(String name) {
        this.name = name;
    }

    public void addChild(FileSystemComponent child) {
        this.children.add(child);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory = " + name);
        children.forEach(FileSystemComponent::showDetails);
        System.out.println("End of directory = " + name);
    }
}
