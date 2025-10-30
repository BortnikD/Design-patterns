package com.bortnik.patterns.behavioral.observer;

public class ForecastDisplay implements Observer {
    private float currentPressure = 1013.0f;
    private float lastPressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.println("= Forecast =");
        if (currentPressure > lastPressure) {
            System.out.println("The weather is improving!");
        } else if (currentPressure < lastPressure) {
            System.out.println("Cold weather and rain are expected");
        } else {
            System.out.println("The weather is unchanged");
        }
    }
}