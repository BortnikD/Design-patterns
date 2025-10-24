package com.bortnik.patterns.structural.decorator;

public abstract class AbstractCoffeeDecorator implements Coffee {

    protected final Coffee coffee;

    protected AbstractCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

}
