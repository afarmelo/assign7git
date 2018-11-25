package test.java.decorator;

import static org.junit.Assert.assertEquals;

import main.java.decorator.DamageBoost;
import main.java.decorator.FastHarvest;
import main.java.decorator.Haggle;
import main.java.decorator.NoArmor;
import main.java.decorator.NoSleep;
import main.java.prototype.Farmer;
import main.java.prototype.Robot;
import main.java.prototype.Trader;
import main.java.prototype.Warrior;
import org.junit.Test;

public class DecoratorTest {

    @Test
    public void testDecorators() {
        /* DamageBoost */
        Warrior warBee = new Warrior();
        DamageBoost dmg = new DamageBoost(warBee);        
        assertEquals(30, dmg.getDamage());
        
        /* FastHarvest */
        Farmer farmBee = new Farmer();
        FastHarvest harv = new FastHarvest(farmBee);
        assertEquals(8, harv.getHarvestSpeed());
        
        /* Haggle */
        Trader tradeBee = new Trader();
        Haggle haggle = new Haggle(tradeBee);
        assertEquals(20, haggle.getDiscount());
        
        /* NoArmor */
        NoArmor defenseless = new NoArmor(warBee);
        assertEquals(80, defenseless.getHealth());
        
        /* NoSleep */
        Robot roboBee = new Robot();
        NoSleep sleepless = new NoSleep(roboBee);
        assertEquals(8, sleepless.getRestTime());        
    }
    
    @Test
    public void testCompoundDecorators() {

        /* Start with a simple farmer bee */
        Farmer farmBee = new Farmer();
        
        /* add DamageBoost */
        DamageBoost dmg = new DamageBoost(farmBee);
        
        /* add FastHarvest */
        FastHarvest harv = new FastHarvest(dmg);
        
        /* add Haggle */
        Haggle haggle = new Haggle(harv);
        
        /* add NoArmor */
        NoArmor defenseless = new NoArmor(haggle);
        
        /* add NoSleep */
        NoSleep sleepless = new NoSleep(defenseless);
        
        /* test stats */
        assertEquals(30, sleepless.getDamage());
        assertEquals(8, sleepless.getHarvestSpeed());
        assertEquals(20, sleepless.getDiscount());
        assertEquals(80, sleepless.getHealth());
        assertEquals(8, sleepless.getRestTime());    
    }

}
