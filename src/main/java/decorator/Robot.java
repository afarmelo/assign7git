package main.java.decorator;

import main.java.Bee;
import main.java.BeeSpecies;

public class Robot extends Bee{

    @Override
    public BeeSpecies getSpecies() {
        return BeeSpecies.ROBOT;
    }
}
