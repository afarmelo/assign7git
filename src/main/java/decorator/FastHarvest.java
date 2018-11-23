package main.java.decorator;

import main.java.prototype.Bee;

public class FastHarvest extends Decorator{

    private int _harvBuff;
    
    public FastHarvest(Bee bee) {
        super(bee);
    }
    
    @Override
    public int harvestSpeed() {
        return super._bee.harvestSpeed() + _harvBuff;
    }
    
    public int getHarvestSpeed() {
        return _harvBuff;
    }
    
    public void setHarvestSpeed(int buff) {
        _harvBuff = buff;
    }
}
