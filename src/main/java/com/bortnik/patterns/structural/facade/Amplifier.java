package com.bortnik.patterns.structural.facade;

public class Amplifier {

    void on() {
        System.out.println("Amplifier on");
    }

    void setVolume(int level) {
        System.out.println("Volume = " + level + '%');
    }

    void off() {
        System.out.println("Amplifier off");
    }
}
