package com.bortnik.patterns.structural.facade;

public class HomeTheaterFacade {
    private final TV tv;
    private final DVDPlayer dvd;
    private final Lights lights;
    private final Amplifier amplifier;

    public HomeTheaterFacade(TV tv, DVDPlayer dvd, Lights lights, Amplifier amplifier) {
        this.tv = tv;
        this.dvd = dvd;
        this.lights = lights;
        this.amplifier = amplifier;
    }

    public void watchMovie(String movie) {
        System.out.println("== Preparing to watch a movie ==");
        lights.dim(10);
        tv.on();
        amplifier.on();
        amplifier.setVolume(80);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("== finish watching the movie ==");
        dvd.off();
        amplifier.off();
        tv.off();
        lights.dim(100);
    }
}
