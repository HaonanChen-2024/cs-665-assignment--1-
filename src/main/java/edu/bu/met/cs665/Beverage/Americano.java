package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.BrewBehavior.BrewEspresso;
import edu.bu.met.cs665.BrewBehavior.BrewWater;

public class Americano extends Beverage {
    public Americano() {
        super();
        this.setName("Americano");
        this.setPrice(5.0);
        this.brewBehavior = new BrewEspresso();
        this.brewBehavior2 = new BrewWater();
        this.brewBehavior3 = new BrewWater();
    }
}
