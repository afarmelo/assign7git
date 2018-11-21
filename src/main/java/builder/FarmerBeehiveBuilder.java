package main.java.builder;

import main.java.BeeSpecies;
import main.java.Beehive;

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

    private Beehive _hive = new Beehive();
    
    @Override
    public void AddRooms() {
        _hive.addRooms(50, 8);
    }

    @Override
    public void AddBees() {
        _hive.addBees(30, BeeSpecies.FARMER);
    }

    @Override
    public void AddQueen() {
        _hive.addQueen(BeeSpecies.FARMER);
    }

}
