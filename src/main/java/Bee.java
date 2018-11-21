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
    
    public int harvestSpeed() {
        return 10;
    }
    
    public int restTime() {
        return 10;
    }
    
    public int damage() {
        return 10;
    }
    
    public int health() {
        return 100;
    }
    
    public int discount() {
        return 0;
    }
}
