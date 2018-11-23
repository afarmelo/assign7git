package main.java.prototype;

import main.java.BeeSpecies;

/**
 * Bees live in beehives, and are of a specific 'species' 
 * which grants them bonuses doing certain things. The Bee
 * class implements Cloneable because adding bees to a beehive
 * during beehive creation involves adding many of the same bee
 * repeatedly, so the prototype pattern is used when adding bees.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public abstract class Bee implements Cloneable{
    
    private boolean _isQueen = false;
    private boolean _alive = true;
    
    protected BeeSpecies _species;
    
    public abstract void fight(Bee other);
    
    public BeeSpecies getSpecies() {
        return _species;
    }
    
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return clone;
    }
    
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
    
    public void makeQueen(boolean isQueen) {
        _isQueen = isQueen;
    }
    
    public boolean isQueen() {
        return _isQueen;
    }
    
    public boolean isAlive() {
        return _alive;
    }
}
