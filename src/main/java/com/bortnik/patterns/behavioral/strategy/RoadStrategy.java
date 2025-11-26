package com.bortnik.patterns.behavioral.strategy;

/**
 * Concrete strategy for road shipping.
 */
public class RoadStrategy implements ShippingStrategy {
    private static final double COST_PER_KM_PER_KG = 0.05;

    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * distance * COST_PER_KM_PER_KG;
    }
}
