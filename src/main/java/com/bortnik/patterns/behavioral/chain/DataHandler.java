package com.bortnik.patterns.behavioral.chain;

public class DataHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.contains("data")) {
            System.out.println("Data request received");
        }
        else {
            System.out.println("Not data");
        }
        super.handle(request);
    }
}
