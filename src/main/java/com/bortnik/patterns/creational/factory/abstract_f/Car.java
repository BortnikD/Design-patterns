package com.bortnik.patterns.creational.factory.abstract_f;

public interface Car {
    void drive();
}

interface Engine {
    void start();
}

class SportsCar implements Car {
    public void drive() {
        System.out.println("Driving a sports car!");
    }
}

class SportsEngine implements Engine {
    public void start() {
        System.out.println("Starting a powerful sports engine!");
    }
}

class ElectricCar implements Car {
    public void drive() {
        System.out.println("Driving an electric car!");
    }
}

class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Starting an electric engine silently!");
    }
}
