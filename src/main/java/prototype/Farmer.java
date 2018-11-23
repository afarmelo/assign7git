package main.java.prototype;

import main.java.BeeSpecies;

public class Farmer extends Bee{
    
    public Farmer() {
        _species = BeeSpecies.FARMER;
    }
    
    @Override
    public void fight(Bee other) {
        
    }
}

