package com.bortnik.patterns.behavioral.chain;

public class AuthHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.contains("auth")) {
            System.out.println("Auth request received");
        }
        else {
            System.out.println("Auth request rejected");
            return;
        }
        super.handle(request);
    }
}
