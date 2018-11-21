package main.java.decorator;

import main.java.Bee;
import main.java.BeeSpecies;

public class Warrior extends Bee{

    @Override
    public BeeSpecies getSpecies() {
        return BeeSpecies.ROBOT;
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
        return 12;
    }

    @Override
    public int health() {
        return 80;
    }

    @Override
    public int discount() {
        return 0;
    }
}

