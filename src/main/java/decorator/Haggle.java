package main.java.decorator;

import main.java.prototype.BeeBase;

public class Haggle extends BeeDecoratorBase {

    private int discount;
    
    public Haggle(BeeBase bee) {
        super(bee);
        discount = 20;
    }

    @Override
    public int getDiscount() {
        int totalDiscount = bee.getDiscount();
        totalDiscount += discount;
        return totalDiscount;
    }
}
