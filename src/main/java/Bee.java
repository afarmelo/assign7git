package main.java;

/**
 * Bees live in beehives, and are of a specific 'species' 
 * which grants them bonuses doing certain things.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public abstract class Bee {
    public abstract BeeSpecies getSpecies();
    public abstract int harvestSpeed();
    public abstract int restTime();
    public abstract int damage();
    public abstract int health();
    public abstract int discount();
}
