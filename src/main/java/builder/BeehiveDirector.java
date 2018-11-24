package main.java.builder;

/**
 * The BeehiveDirector is the class which does the building. For the Builder
 * pattern, the abstract builder provides the methods for the children
 * to inherit and override, then the director is what gets invoked to 
 * do the building.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class BeehiveDirector {

    /**
     * Tell the BeehiveBuilder to build a hive.
     * @param bhBuilder the builder which will be building a hive
     */
    public void buildHive(BeehiveBuilder bhBuilder) {
        bhBuilder.addRooms();
        bhBuilder.addBees();
        bhBuilder.addQueen();
    }
}
