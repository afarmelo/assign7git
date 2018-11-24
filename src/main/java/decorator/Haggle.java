package main.java.decorator;

import main.java.prototype.BeeBase;

public class Haggle extends BeeDecoratorBase{

    private int _discount;
    
    public Haggle(BeeBase bee) {
        super(bee);
        _discount = 20;
    }

    @Override
    public int getDiscount() {
        int discount = _bee.getDiscount();
        discount+=_discount;
        return discount;
    }
}
