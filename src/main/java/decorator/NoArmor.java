package main.java.decorator;

import main.java.prototype.BeeBase;

/**
 * NoArmor is a decorator which debuffs the health of a Bee that it's added to.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class NoArmor extends BeeDecoratorBase {

    private int armorDebuff;
    
    public NoArmor(BeeBase bee) {
        super(bee);
        armorDebuff = 20;
    }
    
    @Override
    public int getHealth() {
        int health = bee.getHealth();
        health -= armorDebuff;
        return health;
    }
}
