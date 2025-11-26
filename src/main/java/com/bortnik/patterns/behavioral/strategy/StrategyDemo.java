package com.bortnik.patterns.behavioral.strategy;

/**
 * Demo class to showcase the Strategy pattern with shipping strategies.
 */
public class StrategyDemo {
    public static void demonstrate() {
        System.out.println("=== Strategy Pattern Demo ===");

        ShippingCalculator calculator = new ShippingCalculator(new RoadStrategy());
        System.out.println("Road Shipping Cost: " + calculator.calculateShippingCost(10, 100));

        calculator.setStrategy(new AirStrategy());
        System.out.println("Air Shipping Cost: " + calculator.calculateShippingCost(10, 100));
    }
}
