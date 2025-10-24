package com.bortnik.patterns.structural.adapter;

public class ChargeAdapter implements NewCharger {
    private final OldCharger oldCharger;

    public ChargeAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithUSBTypeC() {
        System.out.println("Converting USB Type-C to MicroUSB");
        oldCharger.chargeWithMicroUSB();
    }
}
