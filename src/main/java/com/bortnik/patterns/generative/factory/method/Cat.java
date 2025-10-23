package com.bortnik.patterns.generative.factory.method;

public class Cat implements Movable {
    @Override
    public void move() {
        System.out.println("Cat moving... Meow ^^");
    }
}
