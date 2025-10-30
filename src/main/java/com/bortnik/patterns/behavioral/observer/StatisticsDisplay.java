package com.bortnik.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer {
    private final List<Float> temperatureHistory = new ArrayList<>();

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureHistory.add(temperature);
        display();
    }

    public void display() {
        float sum = 0;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;

        for (float temp : temperatureHistory) {
            sum += temp;
            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }

        float average = sum / temperatureHistory.size();

        System.out.println("= Statistic =");
        System.out.println("Average temperature: " + average + 'C');
        System.out.println("Minimum temperature: " + min + 'C');
        System.out.println("Maximum temperature: " + max + 'C');
    }
}
