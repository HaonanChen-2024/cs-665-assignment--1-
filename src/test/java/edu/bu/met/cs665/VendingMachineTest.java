package edu.bu.met.cs665;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VendingMachineTest {

    @Test
    void testSelectBeverage() {
        VendingMachine machine = new VendingMachine();
        machine.selectBeverage(); // Simulate selecting a drink
        assertNotNull(machine.getSelectedBeverage(), "Selected beverage should not be null");
    }

    @Test
    void testStartProcess() {
        VendingMachine machine = new VendingMachine();
        machine.start(); // Start the vending machine process
        assertNotNull(machine.getSelectedBeverage(), "Selected beverage should not be null after start");
    }
}

