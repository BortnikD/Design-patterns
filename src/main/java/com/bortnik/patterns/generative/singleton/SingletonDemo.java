package com.bortnik.patterns.generative.singleton;

public class SingletonDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Singleton Pattern ===");
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.doSomething();

        System.out.println("singleton1 == singleton2 = " + (singleton1 == singleton2)); // true - the same object
    }
}
