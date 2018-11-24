package main.java.decorator;

import main.java.prototype.BeeBase;

public class DamageBoost extends BeeDecoratorBase {

    private int dmgBuff;
    
    public DamageBoost(BeeBase bee) {
        super(bee);
        dmgBuff = 20;
    }
    
    @Override
    public int getDamage() {
        int dmg = bee.getDamage();
        dmg += dmgBuff;
        return dmg;
    }
}
