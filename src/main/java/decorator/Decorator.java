package main.java.decorator;

import main.java.Bee;
import main.java.BeeSpecies;

public class Decorator extends Bee{
    
    protected Bee _bee;
    
    public Decorator(Bee bee) {
        _bee = bee;
    }

    @Override
    public BeeSpecies getSpecies() {
        return _bee.getSpecies();
    }

    @Override
    public int harvestSpeed() {
        return _bee.harvestSpeed();
    }

    @Override
    public int restTime() {
        return _bee.restTime();
    }
    
    @Override
    public int damage() {
        return _bee.damage();
    }

    @Override
    public int health() {
        return _bee.health();
    }

    @Override
    public int discount() {
        return _bee.discount();
    }
}
