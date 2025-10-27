package com.bortnik.patterns.behavioral.chain;

// Factory to create a chain
public class HandlerFactory {
    public static Handler createDefaultChain() {
        Handler auth = new AuthHandler();
        Handler role = new RoleHandler();
        Handler data = new DataHandler();
        auth.setNext(role).setNext(data);
        return auth;
    }
}
