package com.bortnik.patterns.behavioral.interpreter;

public class Constant implements Expression {
    private final boolean value;

    Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return value;
    }
}
