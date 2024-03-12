package Test;

import Core.Dog;
import Core.LLNode;
import Core.MyHashMap;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void testGetString()
    {
        MyHashMap hm = new MyHashMap();

        assertEquals("[0] \n" +
                "[1] \n" +
                "[2] \n" +
                "[3] \n" +
                "[4] \n" +
                "[5] \n" +
                "[6] \n" +
                "[7] \n", hm.getString());
    }

    @Test
    public void testPut()
    {
        Dog fido = new Dog("Fido", "Lab", 4);
        Dog spot = new Dog ("Spot", "Beagle", 2);
        MyHashMap hm = new MyHashMap();

        assertTrue(hm.put("Fido", fido));
        assertTrue(hm.put("Spot", spot));
        assertFalse(hm.put("Spot", spot));

        assertEquals("[0] \n" +
                "[1] \n" +
                "[2] #Dog{name:Fido breed:Lab age:4} -> \n" +
                "[3] \n" +
                "[4] \n" +
                "[5] \n" +
                "[6] #Dog{name:Spot breed:Beagle age:2} -> \n" +
                "[7] \n", hm.getString());
    }

    @Test
    public void testRemove()
    {
        Dog fido = new Dog("Fido", "Lab", 4);
        Dog spot = new Dog ("Spot", "Beagle", 2);
        MyHashMap hm = new MyHashMap();

        hm.put("Fido", fido);
        hm.put("Spot", spot);

        assertTrue(hm.remove("Spot"));

        assertEquals("[0] \n" +
                "[1] \n" +
                "[2] #Dog{name:Fido breed:Lab age:4} -> \n" +
                "[3] \n" +
                "[4] \n" +
                "[5] \n" +
                "[6] \n" +
                "[7] \n", hm.getString());

        assertFalse(hm.remove("Spot"));
    }
    
    @Test
    public void testGet()
    {
        Dog fido = new Dog("Fido", "Lab", 4);
        MyHashMap hm = new MyHashMap();

        hm.put("Fido", fido);

        assertEquals(fido, hm.get("Fido"));
        assertNull(hm.get("Harley"));
    }

    @Test
    public void testSet()
    {
        Dog fido = new Dog("Fido", "Lab", 4);
        Dog fido2 = new Dog("Better Fido", "Labradoodle", 7);
        MyHashMap hm = new MyHashMap();

        hm.put("Fido", fido);

        assertEquals(fido, hm.get("Fido"));
        assertTrue(hm.set("Fido", fido2));
        assertEquals(fido2, hm.get("Fido"));
        assertFalse(hm.set("Harley", fido2));
    }

    @Test
    public void testSize()
    {
        Dog fido = new Dog("Fido", "Lab", 4);
        Dog spot = new Dog ("Spot", "Beagle", 2);
        MyHashMap hm = new MyHashMap();

        hm.put("Fido", fido);
        assertEquals(1, hm.size());

        hm.put("Spot", spot);
        assertEquals(2, hm.size());

        hm.remove("Fido");
        hm.remove("Spot");
        assertEquals(0, hm.size());
    }

}
