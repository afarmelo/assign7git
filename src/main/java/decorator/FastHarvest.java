package main.java.decorator;

import main.java.prototype.BeeBase;

public class FastHarvest extends BeeDecoratorBase{

    private int _harvBuff;
    
    public FastHarvest(BeeBase bee) {
        super(bee);
        _harvBuff = 2;
    }
    
    @Override
    public int getHarvestSpeed() {
        int harvestSpeed = _bee.getHarvestSpeed();
        harvestSpeed-=_harvBuff;
        return harvestSpeed;
    }
}
