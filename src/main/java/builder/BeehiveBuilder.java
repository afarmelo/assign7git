package main.java.builder;

/**
 * The BeehiveBuilder is the abstract builder class which all builders
 * inherit from. 
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public abstract class BeehiveBuilder {

    public abstract void AddRooms();
    
    /**
     * Adding bees on creation of a beehive is a simple operation thanks
     * to the prototype pattern. One bee of a certain type is created, then
     * using that bee, it's passed into the beehive class where it is cloned 
     * multiple times to fill the hive.
     */
    public abstract void AddBees();
    
    
    public abstract void AddQueen();
}
