package com.bortnik.patterns.creational.factory.method;

public class DogFactory extends MovableFactory {
    public Movable createMovable() {
        return new Dog();
    }
}
