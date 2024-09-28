package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.BrewBehavior.BrewBlackTeaBag;
import edu.bu.met.cs665.BrewBehavior.BrewWater;

import java.math.BigDecimal;

public class BlackTea extends Beverage {
    public BlackTea() {
        super();
        this.setName("Black Tea");
        this.setPrice(BigDecimal.valueOf(2.0));
        this.brewBehavior = new BrewWater();
        this.brewBehavior2 = new BrewBlackTeaBag();
        this.brewBehavior3 = new BrewWater();
    }
}
