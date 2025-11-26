package com.bortnik.patterns.behavioral.state;

public class HasPinState implements ATMState {
    private final ATMMachine atm;

    public HasPinState(ATMMachine atm) {
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
        System.out.println("Pin is entered");
    }

    @Override
    public void withdrawCash(int amount) {
        if (atm.getCash() >= amount) {
            System.out.println("Issued: " + amount + " rub.");
            atm.setCash(atm.getCash() - amount);
            if (atm.getCash() <= 0) {
                atm.setState(atm.getNoCashState());
            }
        } else {
            System.out.println("Not enough money.");
            atm.setState(atm.getNoCashState());
        }
    }
}
