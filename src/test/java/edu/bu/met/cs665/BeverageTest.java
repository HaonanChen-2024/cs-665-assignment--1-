package edu.bu.met.cs665;

import edu.bu.met.cs665.Beverage.Americano;
import edu.bu.met.cs665.Beverage.Beverage;
import edu.bu.met.cs665.Beverage.Espresso;
import edu.bu.met.cs665.Beverage.LatteMacchiato;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {

    @Test
    void testAddMilk() {
        Beverage espresso = new Espresso();
        int milkAdded = espresso.addMilk(); // Simulate user adding milk
        assertTrue(milkAdded >= 0 && milkAdded <= 3, "Milk amount should be between 0 and 3");
    }

    @Test
    void testAddSugar() {
        Beverage americano = new Americano();
        int sugarAdded = americano.addSugar(); // Simulate user adding sugar
        assertTrue(sugarAdded >= 0 && sugarAdded <= 3, "Sugar amount should be between 0 and 3");
    }

    @Test
    void testBrewProcess() {
        Beverage latte = new LatteMacchiato();
        latte.brewing(); // Test whether the production process is normal
        assertNotNull(latte); // Verify object is not empty
    }
}