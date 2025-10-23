package com.bortnik.patterns.generative.factory.method;

public class DogFactory extends MovableFactory {
    public Movable createMovable() {
        return new Dog();
    }
}
