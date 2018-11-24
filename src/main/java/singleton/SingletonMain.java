package main.java.singleton;

import main.java.Beehive;

/**
 * SingletonMain is the entry point into the Singleton pattern
 * @author Adam Farmelo
 *
 */
public class SingletonMain {

    /**
     * main method for Apiary class
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\nSingletonMain running...");
        System.out.println("Creating an apiary...");
        
        Apiary apiary = Apiary.getInstance();
        
        apiary.spawnHive(new Beehive());
        apiary.spawnHive(new Beehive());
        
        System.out.println("There are " + apiary.getHives()
            + " hives in this apiary");
        
        System.out.println("...SingletonMain finished.\n");
    }
}
