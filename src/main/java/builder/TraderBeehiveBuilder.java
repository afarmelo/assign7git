package main.java.builder;

import main.java.BeeSpecies;
import main.java.Beehive;

/**
 * Trader Bees are a peaceful roaming type. They barter and trade
 * to survive, and because of their increased charisma they can haggle
 * with other Beehives for -20% resource costs.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class TraderBeehiveBuilder extends BeehiveBuilder {

    private Beehive _hive = new Beehive();

    @Override
    public void AddRooms() {
        _hive.addRooms(40, 8);
    }

    @Override
    public void AddBees() {
        _hive.addBees(30, BeeSpecies.TRADER);
    }

    @Override
    public void AddQueen() {
        // TODO Auto-generated method stub
        _hive.addQueen(BeeSpecies.TRADER);
    }
}
