package com.bortnik.patterns.behavioral.state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawCash(int amount);
}
