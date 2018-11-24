package main.java.decorator;

import main.java.BeeSpecies;
import main.java.prototype.BeeBase;

public abstract class BeeDecoratorBase extends BeeBase {
    
    protected BeeBase bee;
    
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
