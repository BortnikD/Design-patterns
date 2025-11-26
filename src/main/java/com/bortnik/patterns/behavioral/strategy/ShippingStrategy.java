package com.bortnik.patterns.behavioral.strategy;

/**
 * Strategy interface for different shipping methods.
 */
public interface ShippingStrategy {
    double calculateShippingCost(double weight, double distance);
}
