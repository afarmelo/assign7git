package main.java.decorator;

import main.java.Bee;
import main.java.BeeSpecies;

public class Trader extends Bee{

    @Override
    public BeeSpecies getSpecies() {
        return BeeSpecies.TRADER;
    }

    @Override
    public int harvestSpeed() {
        return 5;
    }

    @Override
    public int restTime() {
        return 10;
    }
    
    @Override
    public int damage() {
        return 5;
    }

    @Override
    public int health() {
        return 100;
    }

    @Override
    public int discount() {
        return 20;
    }
}
