package com.bortnik.patterns.behavioral.state;

/**
 * Demo class to showcase the State design pattern with an ATM machine example.
 */
public class StateDemo {
    public static void demonstrate() {
        System.out.println("=== Demo State Pattern ===");
        ATMMachine atm = new ATMMachine();

        atm.setState(atm.getHasCardState());
        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(500);
        atm.withdrawCash(2000);
    }
}
