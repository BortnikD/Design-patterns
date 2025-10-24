package com.bortnik.patterns.generative.factory.abstract_f;

interface CarPartsFactory {
    Car createCar();
    Engine createEngine();
}

class SportsCarFactory implements CarPartsFactory {
    public Car createCar() {
        return new SportsCar();
    }

    public Engine createEngine() {
        return new SportsEngine();
    }
}

class ElectricCarFactory implements CarPartsFactory {
    public Car createCar() {
        return new ElectricCar();
    }

    public Engine createEngine() {
        return new ElectricEngine();
    }
}