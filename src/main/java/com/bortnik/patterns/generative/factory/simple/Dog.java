package com.bortnik.patterns.generative.factory.simple;

public class Dog implements Movable {
    @Override
    public void move() {
        System.out.println("Dog moving... Woof");
    }
}
