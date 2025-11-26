package com.bortnik.patterns.behavioral.state;

public class HasCardState implements ATMState {
    private final ATMMachine atm;

    public HasCardState(ATMMachine atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card has been inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card has been ejected");
        atm.setState(atm.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("Pin has been entered");
            atm.setState(atm.getHasPinState());
        }
        else {
            System.out.println("Pin has been entered");
            atm.setState(atm.getNoCardState());
        }
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("for start enter PIN");
    }
}
