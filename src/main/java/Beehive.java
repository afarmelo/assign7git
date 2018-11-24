package main.java;

import java.util.ArrayList;

import main.java.prototype.Bee;
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

    private ArrayList<Bee> _bees;
    private ArrayList<Room> _spawners;
    private Bee _queen;
    
    public Beehive() {
        _bees = new ArrayList<Bee>();
        _spawners = new ArrayList<Room>();
    }
    
    public void addRooms(int amount, int ticks) {
        for (int i=0; i<amount; i++) {
            _spawners.add(new Room(ticks));
        }
    }
    
    public void addBees(int amount, Bee type) {
        Bee temp;
        
        switch(type.getSpecies()) {
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
        
        for (int i=0; i<amount; i++) {
            _bees.add((Bee)temp.clone());
        }
    }
    
    public void addQueen(Bee queen) {
        _queen = queen;
        _queen.makeQueen(true);
    }
    
    @Override
    public String toString() {
        String out = "";
        out+=("This beehive is a " + _bees.get(0).getSpecies() + " hive.\n");
        out+=("There are " + _bees.size() + " bees,\n");
        out+=(_spawners.size() + " rooms,\n");
        out+=("and");
        if (_queen != null) {
            out+=(" a queen.");
        } else {
            out+=(" no queen.");
        }
        return out;
    }
    
    private class Room {
        private int _ticksToBuild;
        private Room(int ticks) {
            _ticksToBuild = ticks;
        }
        
        public void setTicks(int ticks) {
            _ticksToBuild = ticks;
        }
    }
}
