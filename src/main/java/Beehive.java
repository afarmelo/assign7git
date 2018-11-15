package main.java;

import java.util.ArrayList;

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
    
    public void addBees(int amount, BeeSpecies species) {
        for (int i=0; i<amount; i++) {
            _bees.add(new Bee(species));
        }
    }
    
    public void addQueen(BeeSpecies species) {
        _queen = new Bee(species);
        _queen.makeQueen(true);
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
