package main.java.prototype;

import main.java.decorator.FastHarvest;
import main.java.decorator.Haggle;

public class PrototypeMain {

    public static void main(String[] args) {
        System.out.println("\nPrototypeMain running...");
        System.out.println("Creating a Farmer Bee");
        
        Farmer joe = new Farmer();
        System.out.println("Joe:\n" + joe.toString());        
        System.out.println("Cloning Joe...");
        
        Farmer john = (Farmer)joe.clone();
        System.out.println("John:\n" + john.toString());
        
        System.out.println("Adding a decorator to Joe..");
        FastHarvest farmerJoe = new FastHarvest(joe);
        System.out.println("Farmer Joe:\n" + farmerJoe.toString());
        
        System.out.println("Adding a decorator to John..");
        Haggle smoothTalkingJohn = new Haggle(john);
        System.out.println("Smooth Talking John:\n" + smoothTalkingJohn.toString());
        
        System.out.println("...PrototypeMain finished.\n");
    }
}
