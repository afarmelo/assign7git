package main.java.builder;

import main.java.Beehive;
import main.java.prototype.Bee;
import main.java.prototype.Robot;

/**
 * The Robot Bees have little need for rest, being able to operate 
 * at 100% efficiency with %10 the rest that a living Bee needs. 
 * Because of their increased work capabilities, any construction
 * on new rooms in their hive is done with 75% less time. Their
 * metal skin and wings also provide them with more resilience 
 * to attack, which results in more health per Bee. However,
 * since they work more often and have more armor/health,
 * there are typically less robot Bees in a hive.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class RobotBeehiveBuilder extends BeehiveBuilder {

    private Beehive _hive = new Beehive();

    @Override
    public void AddRooms() {
        _hive.addRooms(40, 2);
    }

    @Override
    public void AddBees() {
        Bee robot = new Robot();
        _hive.addBees(15, robot);
    }

    @Override
    public void AddQueen() {
        _hive.addQueen(new Robot());
    }
}
