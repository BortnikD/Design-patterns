package com.bortnik.patterns.behavioral.observer;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + this.temperature + "C\n" +
                "Current humidity: " + this.humidity + "%\n" +
                "Current pressure: " + this.pressure + "Pa");
    }

}
