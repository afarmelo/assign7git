package main.java.decorator;

import main.java.prototype.Farmer;
import main.java.prototype.Trader;

/**
 * DecoratorMain is the entry point into the Decorator pattern
 * @author Adam Farmelo
 *
 */
public class DecoratorMain {

    public static void main() {
        System.out.println("\nDecoratorMain running...");
        
        // create two bees   
        Farmer john = new Farmer();        
        System.out.println("Farmer John: \n" + john.toString());
        
        Trader joe = new Trader();
        System.out.println("Trader Joe: \n" + joe.toString());
        
        // create decorators
        FastHarvest farmerJohn = new FastHarvest(john);
        System.out.println("Farmer John with fastHarvest decorator: \n" + 
                farmerJohn.toString());
        
        Haggle traderJoe = new Haggle(joe);
        System.out.println("Trader Joe with haggle decorator: \n" + 
                traderJoe.toString());
        
        NoSleep talentedJoe = new NoSleep(traderJoe);
        System.out.println("Trader Joe with haggle and noSleep decorator: \n" +
                talentedJoe.toString());
        
        System.out.println("...DecoratorMain finished.\n");
    }
}
