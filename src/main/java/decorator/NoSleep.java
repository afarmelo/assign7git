package main.java.decorator;

import main.java.prototype.BeeBase;

public class NoSleep extends BeeDecoratorBase{

    private int _sleepBuff;
    
    public NoSleep(BeeBase bee) {
        super(bee);
        _sleepBuff=2;
    }

    @Override
    public int getRestTime() {
        int rest = _bee.getRestTime();
        rest-=_sleepBuff;
        return rest;
    }
}
