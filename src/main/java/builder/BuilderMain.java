package main.java.builder;

import main.java.Beehive;

/**
 * BuilderMain is the entry point into the builder pattern
 * @author Adam Farmelo
 *
 */
public class BuilderMain {

    public static void main(String[] args) {
        System.out.println("\nBuilderMain running...");
        
        System.out.println("Creating a director..");
        BeehiveDirector dir = new BeehiveDirector();
        
        System.out.println("Creating beehive builders..");
        FarmerBeehiveBuilder farmBuilder = new FarmerBeehiveBuilder();
        TraderBeehiveBuilder tradeBuilder = new TraderBeehiveBuilder();
        
        System.out.println("Building hives..\n");
        dir.buildHive(farmBuilder);
        Beehive farmHive = (Beehive)farmBuilder.getHive();
        System.out.println(farmHive.toString());
        
        dir.buildHive(tradeBuilder);
        Beehive tradeHive = (Beehive)tradeBuilder.getHive();
        System.out.println(tradeHive.toString()); 
        
        System.out.println("...BuilderMain finished.\n");
    }
}
