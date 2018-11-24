package main.java;
import main.java.builder.BuilderMain;
import main.java.decorator.DecoratorMain;
import main.java.prototype.PrototypeMain;
import main.java.singleton.SingletonMain;
/**
 * Here is the entry point into the Design Patterns assignment.
 * 
 * @author Adam Farmelo
 */
public class Main {

    /**
     * main method runs all mains from the other packages
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("\nDesign patterns application starting... ");
        SingletonMain.main(args);
        BuilderMain.main(args);
        DecoratorMain.main(args);
        PrototypeMain.main(args);
        System.out.println("\n....Design patterns application finished.\n");
    }
}
