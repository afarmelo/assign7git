package test.java.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import main.java.Beehive;
import main.java.singleton.Apiary;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testApiary() {
        
        // apiary instance
        Apiary apiary = null;
        
        // test apiary is null before getting instance
        assertNull(apiary);
        
        // get instance
        apiary = Apiary.getInstance();
        
        // check that the apiary is not null
        assertFalse(apiary == null);
        
        // create a new reference
        Apiary instance = null;
        
        instance = Apiary.getInstance();        
        
        // check that both references point to the same apiary object
        assertEquals(apiary, instance);
        
        // add beehives to the apiary
        // NOTE: it shouldn't matter which reference we use to add an Apiary
        apiary.spawnHive(new Beehive());
        instance.spawnHive(new Beehive());
        
        // check that both references point to an apiary with 2 beehives
        assertEquals(2, apiary.getHives().size());
        assertEquals(2, instance.getHives().size());
        
        apiary.clean();
    }

}
