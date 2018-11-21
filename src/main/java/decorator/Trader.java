package main.java.decorator;

import main.java.Bee;
import main.java.BeeSpecies;

public class Trader extends Bee{

    @Override
    public BeeSpecies getSpecies() {
        return BeeSpecies.TRADER;
    }
}
