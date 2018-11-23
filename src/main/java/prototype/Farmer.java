package main.java.decorator;

import main.java.Bee;
import main.java.BeeSpecies;

public class Farmer extends Bee{
    
    @Override
    public BeeSpecies getSpecies() {
        return BeeSpecies.FARMER;
    }
}

