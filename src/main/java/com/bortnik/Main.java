package com.bortnik;

import com.bortnik.patterns.behavioral.chain.ChainDemo;
import com.bortnik.patterns.behavioral.command.CommandDemo;
import com.bortnik.patterns.behavioral.interpreter.InterpreterDemo;
import com.bortnik.patterns.behavioral.iterator.IteratorDemo;
import com.bortnik.patterns.behavioral.mediator.MediatorDemo;
import com.bortnik.patterns.creational.builder.BuilderDemo;
import com.bortnik.patterns.creational.factory.abstract_f.AbstractFactoryDemo;
import com.bortnik.patterns.creational.factory.method.FactoryMethodDemo;
import com.bortnik.patterns.creational.factory.simple.SimpleFactoryDemo;
import com.bortnik.patterns.creational.prototype.PrototypeDemo;
import com.bortnik.patterns.creational.singleton.SingletonDemo;
import com.bortnik.patterns.structural.adapter.AdapterDemo;
import com.bortnik.patterns.structural.bridge.BridgeDemo;
import com.bortnik.patterns.structural.composite.CompositeDemo;
import com.bortnik.patterns.structural.decorator.DecoratorDemo;
import com.bortnik.patterns.structural.facade.FacadeDemo;
import com.bortnik.patterns.structural.flyweight.FlyweightDemo;
import com.bortnik.patterns.structural.proxy.ProxyDemo;

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

        FlyweightDemo.demonstrate();

        ProxyDemo.demonstrate();

        System.out.println("===== Behavioral Patterns =====");

        ChainDemo.demonstrate();

        CommandDemo.demonstrate();

        InterpreterDemo.demonstrate();

        IteratorDemo.demonstrate();

        MediatorDemo.demonstrate();
    }
}
