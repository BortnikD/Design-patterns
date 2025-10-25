package com.bortnik.patterns.structural.facade;

public class DVDPlayer {
    public void on() {
        System.out.println("DVDPlayer on");
    }

    public void off() {
        System.out.println("DVDPlayer off");
    }

    void play(String movie) {
        System.out.println("Movie playback: " + movie);
    }
}
