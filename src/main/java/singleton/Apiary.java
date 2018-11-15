package main.java.singleton;

/**
 * The Apiary class is a Singleton in the Beehive simulator. 
 * Apiaries have beehives, which have rooms, which spawn bees.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class Apiary {

    private Apiary _instance;
    
    private Apiary() {}
    
    public Apiary getInstance() {
        if (_instance == null) {
            _instance = new Apiary();
        }
        return _instance;
    }
}
