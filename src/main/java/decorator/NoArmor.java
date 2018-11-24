package main.java.decorator;

import main.java.prototype.BeeBase;

public class NoArmor extends BeeDecoratorBase {

    private int _armorDebuff;
    
    public NoArmor(BeeBase bee) {
        super(bee);
        _armorDebuff = 20;
    }
    
    @Override
    public int getHealth() {
        int health = _bee.getHealth();
        health-=_armorDebuff;
        return health;
    }
}
