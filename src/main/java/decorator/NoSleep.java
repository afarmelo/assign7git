package main.java.decorator;

import main.java.prototype.BeeBase;

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
