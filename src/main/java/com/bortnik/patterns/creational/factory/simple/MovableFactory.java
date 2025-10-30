package com.bortnik.patterns.creational.factory.simple;

public class MovableFactory {
    public static Movable createMovable(String type) {
        return switch(type.toLowerCase()) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            default -> throw new IllegalArgumentException("What are you doing?");
        };
    }
}
