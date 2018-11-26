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
public abstract class BeeBase implements Cloneable {
    
    protected boolean isQueen = false;
    protected boolean alive = true;
    protected int harvestSpeed = 10;
    protected int restTime = 10;
    protected int damage = 10;
    protected int health = 100;
    protected int discount = 0;
    protected BeeSpecies species;
    
    public BeeBase(BeeSpecies species) {
        this.species = species;
    }
    
    public int getHarvestSpeed() {
        return harvestSpeed;
    }
    
    public int getRestTime() {
        return restTime;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getHealth() {
        return health;
    }
    
    public int getDiscount() {
        return discount;
    }
    
    public BeeSpecies getSpecies() {
        return species;
    }
    
    /**
     * This is the part of the class which is directly related to the Prototype pattern.
     * Return a clone of this object.
     */
    @Override
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
        this.isQueen = isQueen;
    }
    
    public void kill(boolean isAlive) {
        this.alive = isAlive;
    }
    
    public boolean isQueen() {
        return isQueen;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
    @Override
    public String toString() {
        String out = "";
        out += "This Bees attributes:\n";
        out += "Harvest Speed: " + getHarvestSpeed() + "\n";
        out += "Rest Time: " + getRestTime() + "\n";
        out += "Damage: " + getDamage() + "\n";
        out += "Health: " + getHealth() + "\n";
        out += "Trading discount: " + getDiscount() + "%\n";
        return out;
    }
}