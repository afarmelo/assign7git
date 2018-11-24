package main.java;

import java.util.ArrayList;

import main.java.prototype.BeeBase;
import main.java.prototype.Farmer;
import main.java.prototype.Robot;
import main.java.prototype.Trader;
import main.java.prototype.Warrior;

/**
 * A beehive consists of a network of interconnected rooms where
 * Bees are spawned and trained in their native discipline. The Bees
 * in a Beehive all have specific attributes, and can only contain
 * Bees of a specific BeeSpecies.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class Beehive {

    private ArrayList<BeeBase> bees;
    private ArrayList<Room> spawners;
    private BeeBase queen;
    
    public Beehive() {
        bees = new ArrayList<BeeBase>();
        spawners = new ArrayList<Room>();
    }
    
    /**
     * Add a number of rooms to a beehive, where each room takes a specific
     * number of ticks to spawn a single Bee.
     * @param amount amount of rooms to add
     * @param ticks number of ticks for a room to spawn a Bee
     */
    public void addRooms(int amount, int ticks) {
        for (int i = 0; i < amount; i++) {
            spawners.add(new Room(ticks));
        }
    }
    
    /**
     * Add a number of bees of a certain type to the hive.
     * @param amount amount of bees to add to the hive
     * @param type the type or BeeSpecies of the Bee
     */
    public void addBees(int amount, BeeBase type) {
        BeeBase temp;
        
        switch (type.getSpecies()) {
            case FARMER: { 
                temp = new Farmer();
                break;
            }
            case ROBOT: { 
                temp = new Robot();
                break;
            }
            case WARRIOR: { 
                temp = new Warrior();
                break;
            }
            case TRADER: { 
                temp = new Trader();
                break;
            }
            default: {
                temp = new Trader();
            }
        }
        
        for (int i = 0; i < amount; i++) {
            bees.add((BeeBase)temp.clone());
        }
    }
    
    public void addQueen(BeeBase queen) {
        this.queen = queen;
        queen.makeQueen(true);
    }
    
    public ArrayList<BeeBase> getBees() {
        return bees;
    }
    
    @Override
    public String toString() {
        String out = "";
        out += ("This beehive is a " + bees.get(0).getSpecies() + " hive.\n");
        out += ("There are " + bees.size() + " bees,\n");
        out += (spawners.size() + " rooms,\n");
        out += ("and");
        if (queen != null) {
            out += (" a queen.");
        } else {
            out += (" no queen.");
        }
        return out;
    }
    
    private class Room {
        private int ticksToBuild;
        
        private Room(int ticks) {
            ticksToBuild = ticks;
        }
        
        public void setTicks(int ticks) {
            ticksToBuild = ticks;
        }
    }
}
