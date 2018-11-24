package main.java.builder;

import main.java.Beehive;
import main.java.prototype.BeeBase;
import main.java.prototype.Warrior;

/**
 * Warrior bees have been trained in the craft of war. They  are 
 * ruthless and leave no survivors after a battle. Since fighting
 * has become a generational practice, the warriors have found new
 * ways to sharpen their blades for battle and have a (20%) increased
 * damage output. Although they have mastered the blade, they often
 * overlook their armor as a result of bloodlust, leaving them with
 * less health to battle.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class WarriorBeehiveBuilder extends BeehiveBuilder {

    private Beehive hive;
    
    public WarriorBeehiveBuilder() {
        hive = new Beehive();
    }

    @Override
    public void addRooms() {
        hive.addRooms(50, 8);
    }
    
    @Override
    public void addBees() {
        BeeBase warrior = new Warrior();
        hive.addBees(30, warrior);
    }

    @Override
    public void addQueen() {
        hive.addQueen(new Warrior());
    }
    
    @Override
    public Beehive getHive() {
        return hive;
    }
}
