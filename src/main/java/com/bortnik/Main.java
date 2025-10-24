package com.bortnik;

import com.bortnik.patterns.generative.builder.BuilderDemo;
import com.bortnik.patterns.generative.factory.abstract_f.AbstractFactoryDemo;
import com.bortnik.patterns.generative.factory.method.FactoryMethodDemo;
import com.bortnik.patterns.generative.factory.simple.SimpleFactoryDemo;
import com.bortnik.patterns.generative.singleton.SingletonDemo;

public class Main {
    public static void main(String[] args) {
        BuilderDemo.demonstrate();

        SimpleFactoryDemo.demonstrate();

        FactoryMethodDemo.demonstrate();

        AbstractFactoryDemo.demonstrate();

        SingletonDemo.demonstrate();
    }
}