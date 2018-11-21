package main.java.decorator;

import main.java.Bee;

public class NoArmor extends Decorator {

    private int _armorDebuff;
    
    public NoArmor(Bee bee) {
        super(bee);
    }
    
    @Override
    public int health() {
        return super._bee.health()-_armorDebuff;
    }
    
    public int getArmorDebuff() {
        return _armorDebuff;
    }
    
    public void setArmorDebuff(int debuff) {
        _armorDebuff = debuff;
    }
}
