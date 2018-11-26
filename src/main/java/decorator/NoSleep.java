package main.java.decorator;

import main.java.prototype.BeeBase;

/**
 * NoSleep is a decorator which buffs the rest time of the Bee it's added to.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
public class NoSleep extends BeeDecoratorBase {

    private int sleepBuff;
    
    public NoSleep(BeeBase bee) {
        super(bee);
        sleepBuff = 2;
    }

    @Override
    public int getRestTime() {
        int rest = bee.getRestTime();
        rest -= sleepBuff;
        return rest;
    }
}
