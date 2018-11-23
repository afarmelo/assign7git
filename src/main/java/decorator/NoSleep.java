package main.java.decorator;

import main.java.prototype.Bee;

public class NoSleep extends Decorator{

    private int _sleepDebuff;
    
    public NoSleep(Bee bee) {
        super(bee);
    }

    @Override
    public int restTime() {
        return super._bee.restTime() - _sleepDebuff;
    }
    
    public int getSleepDebuff() {
        return _sleepDebuff;
    }
    
    public void setSleepDebuff(int debuff) {
        _sleepDebuff = debuff;
    }
}
