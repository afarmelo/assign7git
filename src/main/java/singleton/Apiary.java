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
    private ArrayList<Beehive> _hives;
    
    private Apiary() {
        _hives = new ArrayList<Beehive>();
    }
    
    public static Apiary getInstance() {
        if (_instance == null) {
            _instance = new Apiary();
        }
        return _instance;
    }
    
    public void spawnHive(Beehive toAdd) {
        _hives.add(toAdd);
    }
}
