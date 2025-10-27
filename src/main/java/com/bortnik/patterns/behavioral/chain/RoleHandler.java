package com.bortnik.patterns.behavioral.chain;

public class RoleHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.contains("admin")) {
            System.out.println("Role admin request received");
        }
        else {
            System.out.println("Default role");
        }
        super.handle(request);
    }
}
