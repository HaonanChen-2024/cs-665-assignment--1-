package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.BrewBehavior.BrewBehavior;
import edu.bu.met.cs665.BrewBehavior.BrewEspresso;
import edu.bu.met.cs665.BrewBehavior.BrewWater;
import edu.bu.met.cs665.BrewBehavior.NoBrew;

public class Espresso extends Beverage {
    public Espresso() {
        super();
        this.setName("Espresso");
        this.setPrice(2.5);
        this.brewBehavior = new BrewEspresso();
        this.brewBehavior2 = new BrewWater();
        this.brewBehavior3 = new NoBrew();
    }
}
