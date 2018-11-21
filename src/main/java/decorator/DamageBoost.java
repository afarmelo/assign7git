package main.java.decorator;

import main.java.Bee;

public class DamageBoost extends Decorator{

    private int _dmgBuff;
    
    public DamageBoost(Bee bee) {
        super(bee);
    }
    
    @Override
    public int damage() {
        return super._bee.damage() + _dmgBuff;
    }
    
    public int getDamageBoost() {
        return _dmgBuff;
    }
    
    public void setDamageBoost(int buff) {
        _dmgBuff = buff;
    }
}
