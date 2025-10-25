package com.bortnik;

import com.bortnik.patterns.generative.builder.BuilderDemo;
import com.bortnik.patterns.generative.factory.abstract_f.AbstractFactoryDemo;
import com.bortnik.patterns.generative.factory.method.FactoryMethodDemo;
import com.bortnik.patterns.generative.factory.simple.SimpleFactoryDemo;
import com.bortnik.patterns.generative.prototype.PrototypeDemo;
import com.bortnik.patterns.generative.singleton.SingletonDemo;
import com.bortnik.patterns.structural.adapter.AdapterDemo;
import com.bortnik.patterns.structural.bridge.BridgeDemo;
import com.bortnik.patterns.structural.composite.CompositeDemo;
import com.bortnik.patterns.structural.decorator.DecoratorDemo;
import com.bortnik.patterns.structural.facade.FacadeDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Generated Patterns =====");

        BuilderDemo.demonstrate();

        SimpleFactoryDemo.demonstrate();

        FactoryMethodDemo.demonstrate();

        AbstractFactoryDemo.demonstrate();

        SingletonDemo.demonstrate();

        PrototypeDemo.demonstrate();

        System.out.println("===== Structural Patterns =====");

        DecoratorDemo.demonstrate();

        AdapterDemo.demonstrate();

        BridgeDemo.demonstrate();

        CompositeDemo.demonstrate();

        FacadeDemo.demonstrate();
    }
}
