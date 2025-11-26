package com.bortnik.patterns.behavioral.state;

public class ATMMachine {
    private final ATMState noCardState = new NoCardState(this);
    private final ATMState hasCardState = new HasCardState(this);
    private final ATMState hasPinState = new HasPinState(this);
    private final ATMState noCashState = new NoCashState(this);

    private ATMState currentState = noCardState;
    private int cash = 2000;

    public void setState(ATMState newState) {
        currentState = newState;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getHasPinState() {
        return hasPinState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }
}
