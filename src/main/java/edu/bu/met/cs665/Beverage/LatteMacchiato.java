package edu.bu.met.cs665.Beverage;

import edu.bu.met.cs665.BrewBehavior.BrewEspresso;
import edu.bu.met.cs665.BrewBehavior.BrewFoam;
import edu.bu.met.cs665.BrewBehavior.BrewMilk;

import java.math.BigDecimal;

public class LatteMacchiato extends Beverage{
    public LatteMacchiato(){
        super();
        this.setName("Latte Macchiato");
        this.setPrice(BigDecimal.valueOf(6.0));
        this.brewBehavior = new BrewEspresso();
        this.brewBehavior2 = new BrewMilk();  // 加奶
        this.brewBehavior3 = new BrewFoam();  // 加泡沫
    }
}
