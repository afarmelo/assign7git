package main.java.singleton;

import java.util.ArrayList;
import main.java.Beehive;

/**
 * The Apiary class is a Singleton in the Beehive simulator. 
 * Apiaries have beehives, which have rooms, which spawn bees.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class Apiary {

    private static Apiary _instance;
    private ArrayList<Beehive> hives;
    
    private Apiary() {
        hives = new ArrayList<Beehive>();
    }
    
    /**
     * Return the singleton instance of the Apiary class since it cannot
     * be instantiated directly except internally.
     * @return an instance of the Apiary class
     */
    public static Apiary getInstance() {
        if (_instance == null) {
            _instance = new Apiary();
        }
        return _instance;
    }
    
    public void spawnHive(Beehive toAdd) {
        hives.add(toAdd);
    }
    
    public ArrayList<Beehive> getHives() {
        return hives;
    }
    
    public void clean() {
        hives = null;
        _instance = null;
    }
}
