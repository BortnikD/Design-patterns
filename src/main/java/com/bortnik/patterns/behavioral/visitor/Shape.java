package com.bortnik.patterns.behavioral.visitor;

public interface Shape {
    void accept(Visitor visitor);
}
