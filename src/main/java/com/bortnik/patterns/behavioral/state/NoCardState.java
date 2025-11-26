package com.bortnik.patterns.behavioral.state;

public class NoCardState implements ATMState {
    private final ATMMachine atm;

    public NoCardState(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("No card has been inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card has been ejected");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("No card has been entered");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("No card has been withdrawn");
    }
}
