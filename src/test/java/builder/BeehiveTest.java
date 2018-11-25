package test.java.builder;

import static org.junit.Assert.assertEquals;

import main.java.BeeSpecies;
import main.java.Beehive;
import main.java.prototype.Farmer;
import main.java.prototype.Robot;
import main.java.prototype.Trader;
import main.java.prototype.Warrior;
import org.junit.Test;

/**
 * This class is responsible for testing the Beehive class and the Beehive builders.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class BeehiveTest {

    /**
     * This method creates a beehive and adds rooms and Bees to the hive. 
     * When adding Bees to a hive, a certain type or BeeSpecies is added, and no
     * other BeeSpecies should be allowed to be added. This method checks that
     * no other type of species is allowed, hence it expects an exception to be thrown.
     */
    @Test (expected = UnsupportedOperationException.class)
    public void testBeehive() {
        // create a hive
        Beehive hive = new Beehive();
        
        // add rooms and bees
        hive.addRooms(10, 10);
        hive.addBees(10, new Farmer());
        
        // test that rooms and bees were added successfully
        assertEquals(10, hive.getBees().size());
        assertEquals(10, hive.getRooms().size());
        
        // test that the hive has the correct species of Bee
        assertEquals(BeeSpecies.FARMER, hive.getSpecies());
        
        // check if a different species of bee could be added, should throw exception
        hive.addBees(1, new Trader());
    }

    @Test
    public void testAddTraders() {
        // create a hive
        Beehive hive = new Beehive();
        
        // add bees
        hive.addBees(10, new Trader());
        
        // test that bees were added successfully
        assertEquals(10, hive.getBees().size());
        
        // test that the hive has the correct species of Bee
        assertEquals(BeeSpecies.TRADER, hive.getSpecies());
    }
    
    @Test
    public void testAddWarriors() {
        // create a hive
        Beehive hive = new Beehive();
        
        // add bees
        hive.addBees(10, new Warrior());
        
        // test that bees were added successfully
        assertEquals(10, hive.getBees().size());
        
        // test that the hive has the correct species of Bee
        assertEquals(BeeSpecies.WARRIOR, hive.getSpecies());
    }
    
    @Test
    public void testAddRobots() {
        // create a hive
        Beehive hive = new Beehive();
        
        // add bees
        hive.addBees(10, new Robot());
        
        // test that bees were added successfully
        assertEquals(10, hive.getBees().size());
        
        // test that the hive has the correct species of Bee
        assertEquals(BeeSpecies.ROBOT, hive.getSpecies());
    }
    
    @Test
    public void testToString() {
        // create a hive
        Beehive hive = new Beehive();
        
        // test the hive empty
        String emptyHive = "This is an empty hive.\n";        
        assertEquals(emptyHive, hive.toString());
        
        // test the hive with rooms and bees
        hive.addBees(10, new Farmer());
        hive.addRooms(10, 10);        
        String filledHive = "";
        filledHive += ("This beehive is a FARMER hive.\n");
        filledHive += ("There are 10 bees,\n");
        filledHive += ("10 rooms,\n");
        filledHive += ("and no queen.");
        assertEquals(filledHive, hive.toString());
        
        // test the hive with a queen
        filledHive = "";
        filledHive += ("This beehive is a FARMER hive.\n");
        filledHive += ("There are 10 bees,\n");
        filledHive += ("10 rooms,\n");
        filledHive += ("and a queen.");
        hive.addQueen(new Farmer());
        assertEquals(filledHive, hive.toString());
    }
}
