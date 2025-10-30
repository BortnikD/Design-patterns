package com.bortnik.patterns.creational.factory.abstract_f;

/**
 * This pattern assumes that you have several product families located in separate class hierarchies.
 */
public class AbstractFactoryDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Abstract Factory Pattern ===");

        CarPartsFactory sportFactory = new SportsCarFactory();
        Car car = sportFactory.createCar();
        car.drive();
        Engine engine = sportFactory.createEngine();
        engine.start();

        CarPartsFactory electricFactory = new ElectricCarFactory();
        Car electricCar = electricFactory.createCar();
        electricCar.drive();
        Engine electricEngine = electricFactory.createEngine();
        electricEngine.start();
    }
}
