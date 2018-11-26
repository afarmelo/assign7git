package main.java.decorator;

import main.java.BeeSpecies;
import main.java.prototype.BeeBase;

/**
 * This is the abstract base class for all decorators. A decorator is basically
 * a wrapper class for a Bee in this program, so to wrap a Bee you create a decorator
 * with the Bee as the parameter into the constructor.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public abstract class BeeDecoratorBase extends BeeBase {
    
    protected BeeBase bee;
    
    /** 
     * Create a Decorator on top of a specific Bee.
     * @param bee The Bee to add the decorator to.
     */
    public BeeDecoratorBase(BeeBase bee) {
        super(BeeSpecies.BASE);
        this.bee = bee;
    }
    
    @Override
    public int getHarvestSpeed() {
        return bee.getHarvestSpeed();
    }
    
    @Override
    public int getRestTime() {
        return bee.getRestTime();
    }
    
    @Override
    public int getDamage() {
        return bee.getDamage();
    }
    
    @Override
    public int getHealth() {
        return bee.getHealth();
    }
    
    @Override
    public int getDiscount() {
        return bee.getDiscount();
    }
    
    @Override
    public BeeSpecies getSpecies() {
        return bee.getSpecies();
    }

}
