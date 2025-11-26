package com.bortnik.patterns.behavioral.strategy;

/**
 * Context class that uses a ShippingStrategy to calculate shipping costs.
 */
public class ShippingCalculator {
    private ShippingStrategy strategy;

    public ShippingCalculator(final ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateShippingCost(double weight, double distance) {
        return strategy.calculateShippingCost(weight, distance);
    }
}
