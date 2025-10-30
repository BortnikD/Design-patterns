package com.bortnik.patterns.creational.factory.simple;

public class Dog implements Movable {
    @Override
    public void move() {
        System.out.println("Dog moving... Woof");
    }
}
