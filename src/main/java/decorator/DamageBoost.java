package main.java.decorator;

import main.java.prototype.BeeBase;

public class DamageBoost extends BeeDecoratorBase{

    private int _dmgBuff;
    
    public DamageBoost(BeeBase bee) {
        super(bee);
        _dmgBuff = 20;
    }
    
    @Override
    public int getDamage() {
        int dmg = _bee.getDamage();
        dmg+=_dmgBuff;
        return dmg;
    }
}
