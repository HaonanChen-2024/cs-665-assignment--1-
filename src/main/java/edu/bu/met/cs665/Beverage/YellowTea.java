package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.BrewBehavior.BrewBlackTeaBag;
import edu.bu.met.cs665.BrewBehavior.BrewWater;
import edu.bu.met.cs665.BrewBehavior.BrewYellowTeaBag;

public class YellowTea extends Beverage{
    public YellowTea(){
        super();
        this.setName("Black Tea");
        this.setPrice(2.0);
        this.brewBehavior = new BrewWater();
        this.brewBehavior2 = new BrewYellowTeaBag();
        this.brewBehavior3 = new BrewWater();
    }
}
