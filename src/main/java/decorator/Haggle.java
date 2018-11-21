package main.java.decorator;

import main.java.Bee;

public class Haggle extends Decorator{

    private int _discount;
    
    public Haggle(Bee bee) {
        super(bee);
    }

    @Override
    public int discount() {
        return super._bee.discount()-_discount;
    }
    
    public int getDiscount() {
        return _discount;
    }
    
    public void setDiscount(int discount) {
        _discount = discount;
    }
}
