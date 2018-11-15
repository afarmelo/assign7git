package main.java;

/**
 * Bees live in beehives, and are of a specific 'species' 
 * which grants them bonuses doing certain things.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class Bee {

    private BeeSpecies _species;
    private boolean _isQueen;
    
    public Bee(BeeSpecies species) {
        _species = species;
    }
    
    public void makeQueen(boolean queen) {
        _isQueen = queen;
    }
}
