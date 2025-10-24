package com.bortnik.patterns.generative.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    // if two threads invoke a singleton, the singleton can be created twice
    // This can be fixed using 'synchronized'
    // public static synchronized Singleton getInstance()
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // it is created only once
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton doing something");
    }
}
