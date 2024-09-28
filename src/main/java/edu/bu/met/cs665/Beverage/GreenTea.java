package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.BrewBehavior.BrewBlackTeaBag;
import edu.bu.met.cs665.BrewBehavior.BrewGreenTeaBag;
import edu.bu.met.cs665.BrewBehavior.BrewWater;

import java.math.BigDecimal;

public class GreenTea extends Beverage {
    public GreenTea() {
        super();
        this.setName("Black Tea");
        this.setPrice(BigDecimal.valueOf(3.0));
        this.brewBehavior = new BrewWater();
        this.brewBehavior2 = new BrewGreenTeaBag();
        this.brewBehavior3 = new BrewWater();
    }
}
