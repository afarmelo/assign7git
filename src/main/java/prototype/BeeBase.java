package main.java.prototype;

import main.java.BeeSpecies;
import main.java.decorator.FastHarvest;

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
public abstract class BeeBase implements Cloneable{
    
    protected boolean _isQueen = false;
    protected boolean _alive = true;
    protected int _harvestSpeed = 10;
    protected int _restTime = 10;
    protected int _damage = 10;
    protected int _health = 100;
    protected int _discount = 0;
    protected BeeSpecies _species;
    
    public BeeBase(BeeSpecies species) {
        _species = species;
    }
    
    public int getHarvestSpeed() {
        return _harvestSpeed;
    }
    
    public int getRestTime() {
        return _restTime;
    }
    
    public int getDamage() {
        return _damage;
    }
    
    public int getHealth() {
        return _health;
    }
    
    public int getDiscount() {
        return _discount;
    }
    
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
    
    public void makeQueen(boolean isQueen) {
        _isQueen = isQueen;
    }
    
    public boolean isQueen() {
        return _isQueen;
    }
    
    public boolean isAlive() {
        return _alive;
    }
    
    @Override
    public String toString() {
        String out = "";
        out+="This Bees attributes:\n";
        out+="Harvest Speed: " + getHarvestSpeed() + "\n";
        out+="Rest Time: " + getRestTime() + "\n";
        out+="Damage: " + getDamage() + "\n";
        out+="Health: " + getHealth() + "\n";
        out+="Trading discount: " + getDiscount() + "%\n";
        return out;
    }
}