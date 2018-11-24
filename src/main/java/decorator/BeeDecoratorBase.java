package main.java.decorator;

import main.java.BeeSpecies;
import main.java.prototype.BeeBase;

public abstract class BeeDecoratorBase extends BeeBase {
    
    protected BeeBase _bee;
    
    public BeeDecoratorBase(BeeBase bee) {
        super(BeeSpecies.BASE);
        _bee = bee;
    }
    
    @Override
    public int getHarvestSpeed() {
        return _bee.getHarvestSpeed();
    }
    
    @Override
    public int getRestTime() {
        return _bee.getRestTime();
    }
    
    @Override
    public int getDamage() {
        return _bee.getDamage();
    }
    
    @Override
    public int getHealth() {
        return _bee.getHealth();
    }
    
    @Override
    public int getDiscount() {
        return _bee.getDiscount();
    }
    
    @Override
    public BeeSpecies getSpecies() {
        return _bee.getSpecies();
    }

}
