package main.java.builder;

import main.java.Beehive;

/**
 * BuilderMain is the entry point into the builder pattern.
 * @author Adam Farmelo
 *
 */
public class BuilderMain {

    /**
     * Entry point into the builder pattern.
     * @param args execution parameters
     */
    public static void main(String[] args) {
        System.out.println("\nBuilderMain running...");
        
        BeehiveDirector dir = new BeehiveDirector();
        
        FarmerBeehiveBuilder farmBuilder = new FarmerBeehiveBuilder();
        
        dir.buildHive(farmBuilder);
        Beehive farmHive = (Beehive)farmBuilder.getHive();
        System.out.println(farmHive.toString());        

        TraderBeehiveBuilder tradeBuilder = new TraderBeehiveBuilder();
        dir.buildHive(tradeBuilder);
        Beehive tradeHive = (Beehive)tradeBuilder.getHive();
        System.out.println(tradeHive.toString()); 
        
        System.out.println("...BuilderMain finished.\n");
    }
}
