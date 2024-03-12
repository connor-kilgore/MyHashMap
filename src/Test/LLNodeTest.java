package Test;

import Core.Dog;
import Core.LLNode;
import Core.MyHashMap;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LLNodeTest {

    @Test
    public void testMatchesNode () throws Exception
    {
        LLNode node1 = new LLNode("Fido", new Dog("Fido", "Lab", 4));
        LLNode node2 = new LLNode("Spot", new Dog ("Spot", "Beagle", 2));
        LLNode node3 = new LLNode("Fido", new Dog("Fido", "Lab", 4));

        assertFalse(node1.matchesNode(node2));
        assertTrue(node1.matchesNode(node1));
        assertTrue(node1.matchesNode(node3));
    }

    @Test
    public void testGetHashCode () throws Exception
    {
        LLNode node1 = new LLNode("Fido", new Dog("Fido", "Lab", 4));
        LLNode node2 = new LLNode("Spot", new Dog ("Spot", "Beagle", 2));

        assertEquals(386, MyHashMap.getHashCode(node1.getKey()));
        assertEquals(422, MyHashMap.getHashCode(node2.getKey()));
    }

}
