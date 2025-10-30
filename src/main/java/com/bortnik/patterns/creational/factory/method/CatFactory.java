package com.bortnik.patterns.creational.factory.method;

public class CatFactory extends MovableFactory {
    public Movable createMovable() {
        return new Cat();
    }
}
