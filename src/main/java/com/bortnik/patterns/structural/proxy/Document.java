package com.bortnik.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Graphic> images = new ArrayList<>();

    public void addImage(Graphic image) {
        images.add(image);
    }

    public void draw() {
        images.forEach(Graphic::draw);
    }
}
