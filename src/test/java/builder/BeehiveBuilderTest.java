package test.java.builder;

import static org.junit.Assert.assertEquals;

import main.java.Beehive;
import main.java.builder.BeehiveDirector;
import main.java.builder.FarmerBeehiveBuilder;
import main.java.builder.RobotBeehiveBuilder;
import main.java.builder.TraderBeehiveBuilder;
import main.java.builder.WarriorBeehiveBuilder;
import org.junit.Test;

public class BeehiveBuilderTest {

    BeehiveDirector director = new BeehiveDirector();
    
    @Test
    public void testFarmerBeehiveBuilder() {
        // create a builder
        FarmerBeehiveBuilder farmBuilder = new FarmerBeehiveBuilder();
        
        // build the hive
        director.buildHive(farmBuilder);
        
        // get the hive
        Beehive farmHive = farmBuilder.getHive();
        
        // test the hive
        assertEquals(50, farmHive.getRooms().size());
        assertEquals(30, farmHive.getBees().size());
    }

    @Test
    public void testTraderBeehiveBuilder() {
        // create a builder
        TraderBeehiveBuilder traderBuilder = new TraderBeehiveBuilder();
        
        // build the hive
        director.buildHive(traderBuilder);
        
        // get the hive
        Beehive tradeHive = traderBuilder.getHive();
        
        // test the hive
        assertEquals(40, tradeHive.getRooms().size());
        assertEquals(30, tradeHive.getBees().size());
    }
    
    @Test
    public void testWarriorBeehiveBuilder() {
        // create a builder
        WarriorBeehiveBuilder warriorBuilder = new WarriorBeehiveBuilder();
        
        // build the hive
        director.buildHive(warriorBuilder);
        
        // get the hive
        Beehive warriorHive = warriorBuilder.getHive();
        
        // test the hive
        assertEquals(50, warriorHive.getRooms().size());
        assertEquals(30, warriorHive.getBees().size());
    }
    
    @Test
    public void testRobotBeehiveBuilder() {
        // create a builder
        RobotBeehiveBuilder robotBuilder = new RobotBeehiveBuilder();
        
        // build the hive
        director.buildHive(robotBuilder);
        
        // get the hive
        Beehive robotHive = robotBuilder.getHive();
        
        // test the hive
        assertEquals(40, robotHive.getRooms().size());
        assertEquals(15, robotHive.getBees().size());
    }
}
