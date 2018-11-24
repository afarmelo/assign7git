package main.java.builder;

import main.java.Beehive;
import main.java.prototype.BeeBase;
import main.java.prototype.Trader;

/**
 * Trader Bees are a peaceful roaming type. They barter and trade
 * to survive, and because of their increased charisma they can haggle
 * with other Beehives for -20% resource costs.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class TraderBeehiveBuilder extends BeehiveBuilder {

    private Beehive hive;
    
    public TraderBeehiveBuilder() {
        hive = new Beehive();
    }

    @Override
    public void addRooms() {
        hive.addRooms(40, 8);
    }

    @Override
    public void addBees() {
        BeeBase trader = new Trader();
        hive.addBees(30, trader);
    }

    @Override
    public void addQueen() {
        hive.addQueen(new Trader());
    }
    
    @Override
    public Beehive getHive() {
        return hive;
    }
}
