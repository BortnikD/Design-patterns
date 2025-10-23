package com.bortnik.patterns.generative.factory.method;

public class Dog implements Movable {
    @Override
    public void move() {
        System.out.println("Dog moving... Woof");
    }
}
