package com.bortnik.patterns.behavioral.chain;

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(String request) {
        if (next != null) {
            next.handle(request);
        }
    }
}
