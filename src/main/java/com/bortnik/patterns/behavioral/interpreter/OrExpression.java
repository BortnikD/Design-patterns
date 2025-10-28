package com.bortnik.patterns.behavioral.interpreter;

public class OrExpression implements Expression {
    private final Expression left;
    private final Expression right;

    OrExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret() {
        return left.interpret() || right.interpret();
    }
}
