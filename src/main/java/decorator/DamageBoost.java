package main.java.decorator;

import main.java.prototype.BeeBase;

/**
 * DamageBoost is a decorator which buffs the damage of the Bee it's added to.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
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
