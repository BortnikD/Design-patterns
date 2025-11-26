package com.bortnik.patterns.behavioral.state;

public class NoCashState implements ATMState {
    private final ATMMachine atm;

    public NoCashState(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM out of cash.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("ATM out of cash.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("No cash available.");
    }
}
