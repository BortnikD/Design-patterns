package com.bortnik.patterns.behavioral.observer;

/**
 * The Observer pattern allows one object to monitor and react to events occurring in other objects.
 */
public class ObserverDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Observer Pattern ===");
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);

        System.out.println(">>> Update 1");
        weatherStation.setMeasurements(25.5f, 65.0f, 1013.0f);

        System.out.println(">>> Update 2");
        weatherStation.setMeasurements(27.0f, 70.0f, 1012.0f);

        weatherStation.removeObserver(forecastDisplay);

        System.out.println(">>> Update 3 (without a forecast)");
        weatherStation.setMeasurements(23.0f, 80.0f, 1010.0f);
    }
}
