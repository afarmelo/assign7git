package main.java.decorator;

import main.java.prototype.BeeBase;

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
