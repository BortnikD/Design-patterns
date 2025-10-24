package com.bortnik.patterns.structural.adapter;

public class OldPhoneCharger implements OldCharger {
    @Override
    public void chargeWithMicroUSB() {
        System.out.println("Charging with microUSB");
    }
}
