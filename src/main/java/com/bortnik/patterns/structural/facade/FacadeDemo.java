package com.bortnik.patterns.structural.facade;

/**
 * The facade template provides easy object management through a single interface, but you can also
 * manage each object.
 */
public class FacadeDemo {
    public static void demonstrate() {
        System.out.println("===Facade Demo===");
        TV tv = new TV();
        DVDPlayer dvd = new DVDPlayer();
        Lights lights = new Lights();
        Amplifier amplifier = new Amplifier();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvd, lights, amplifier);

        // Simple manage
        homeTheater.watchMovie("Interstellar");
        homeTheater.endMovie();

        // manage each object
        System.out.println("== Preparing to watch a movie ==");
        lights.dim(10);
        tv.on();
        amplifier.on();
        amplifier.setVolume(80);
        dvd.on();
        dvd.play("Star Wars");

        System.out.println("== finish watching the movie ==");
        dvd.off();
        amplifier.off();
        tv.off();
        lights.dim(100);
    }
}
