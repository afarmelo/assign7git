package main.java.decorator;

import main.java.prototype.BeeBase;

public class FastHarvest extends BeeDecoratorBase {

    private int harvBuff;
    
    public FastHarvest(BeeBase bee) {
        super(bee);
        harvBuff = 2;
    }
    
    @Override
    public int getHarvestSpeed() {
        int harvestSpeed = bee.getHarvestSpeed();
        harvestSpeed -= harvBuff;
        return harvestSpeed;
    }
}
