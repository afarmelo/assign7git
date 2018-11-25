package test.java.prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

import main.java.BeeSpecies;

import main.java.prototype.Trader;

import org.junit.Test;

public class BeeTest {

    @Test
    public void testBee() {
        // create a Bee
        Trader bee = new Trader();
        
        // test for nobility
        assertFalse(bee.isQueen());
        bee.makeQueen(true);
        assertTrue(bee.isQueen());
        
        // test stats
        assertEquals(10, bee.getHarvestSpeed());
        assertEquals(10, bee.getRestTime());
        assertEquals(10, bee.getDamage());
        assertEquals(100, bee.getHealth());
        assertEquals(0, bee.getDiscount());
        
        // test species
        assertEquals(BeeSpecies.TRADER, bee.getSpecies());
        
        // test ToString
        String stats = "";
        stats += "This Bees attributes:\n";
        stats += "Harvest Speed: 10\n";
        stats += "Rest Time: 10\n";
        stats += "Damage: 10\n";
        stats += "Health: 100\n";
        stats += "Trading discount: 0%\n";
        assertEquals(stats, bee.toString());
    }

    @Test
    public void testClone() {
        // create a Bee
        Trader bee = new Trader();
        
        // test clone
        Trader beeClone;
        beeClone = (Trader)bee.clone();
        
        // use bee as a 'control' to test against
        assertNotSame(bee, beeClone);
        
        // make the clone noble
        beeClone.makeQueen(true);
        
        // expect that the original is not noble
        assertNotEquals(bee.isQueen(), beeClone.isQueen());
        
        // kill the clone
        beeClone.kill(false);
        
        // expect that the original is not dead
        assertNotEquals(bee.isAlive(), beeClone.isAlive());
    }
}
