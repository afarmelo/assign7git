package main.java.builder;

import main.java.Beehive;
import main.java.prototype.BeeBase;
import main.java.prototype.Farmer;

/**
 * The farmer bees have mastered the art of producing their own resources,
 * as such they understand the intricacies of growing and harvesting. All
 * the farmer bee resource harvesting speeds are increased 20%. Because
 * they are adept at providing food for their colonies, there is an increased
 * prevalence of spawning and sometimes an overabundance of Bees.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class FarmerBeehiveBuilder extends BeehiveBuilder {

    private Beehive hive;
    
    public FarmerBeehiveBuilder() {
        hive = new Beehive();
    }
    
    @Override
    public void addRooms() {
        hive.addRooms(50, 8);
    }

    @Override
    public void addBees() {
        BeeBase farmer = new Farmer();
        hive.addBees(30, farmer);
    }

    @Override
    public void addQueen() {
        hive.addQueen(new Farmer());
    }

    @Override
    public Beehive getHive() {
        return hive;
    }

}
