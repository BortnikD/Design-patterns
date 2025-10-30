package com.bortnik.patterns.creational.factory.simple;

public class Cat implements Movable {
    @Override
    public void move() {
        System.out.println("Cat moving... Meow ^^");
    }
}
