package main.java.builder;

import main.java.Beehive;

/**
 * The BeehiveBuilder is the abstract builder class which all builders
 * inherit from. 
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public abstract class BeehiveBuilder {

    public abstract void addRooms();
    
    /**
     * Adding bees on creation of a beehive is a simple operation thanks
     * to the prototype pattern. One bee of a certain type is created, then
     * using that bee, it's passed into the beehive class where it is cloned 
     * multiple times to fill the hive.
     */
    public abstract void addBees();
    
    
    public abstract void addQueen();
    
    public abstract Beehive getHive();
}
