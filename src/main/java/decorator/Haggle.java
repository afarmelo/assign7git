package main.java.decorator;

import main.java.prototype.BeeBase;

/**
 * Haggle is a decorator which is used to simulate a discount on trading goods,
 * gives a '20%' buff to the Bee added to.
 * @author Adam Farmelo
 * @version 0.1
 *
 */
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
