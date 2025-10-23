package com.bortnik.patterns.generative.factory.method;

public class CatFactory extends MovableFactory {
    public Movable createMovable() {
        return new Cat();
    }
}
