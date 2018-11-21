package main.java;
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
        System.out.println("Hello from Main!");
        SingletonMain.main(args);
    }
}
