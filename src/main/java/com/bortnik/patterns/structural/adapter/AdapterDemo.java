package com.bortnik.patterns.structural.adapter;

/**
 * The Adapter pattern ensures compatibility of incompatibility interfaces
 */
public class AdapterDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Adapter Pattern ===");
        OldCharger oldCharger = new OldPhoneCharger();
        NewCharger newChargerAdapter = new ChargeAdapter(oldCharger);
        newChargerAdapter.chargeWithUSBTypeC();
    }
}
