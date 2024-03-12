package Test;

import Core.Dog;
import Core.LLNode;
import Core.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testGetString () throws Exception
    {
        LLNode node1 = new LLNode("Fido", new Dog ("Fido", "Lab", 4));
        LinkedList list = new LinkedList();

        assertEquals("\n", list.getString());
        list.prependNode(node1);
        assertEquals("#Dog{name:Fido breed:Lab age:4} -> \n", list.getString());
    }

    @Test
    public void testPrepend () throws Exception
    {
        LLNode node1 = new LLNode("Fido", new Dog ("Fido", "Lab", 4));
        LLNode node2 = new LLNode("Spot", new Dog ("Spot", "Beagle", 2));
        LinkedList list = new LinkedList(node1);
        assertTrue(list.prependNode(node2));
        assertFalse(list.prependNode(node2));
        assertEquals("#Dog{name:Spot breed:Beagle age:2} -> #Dog{name:Fido breed:Lab age:4} -> \n", list.getString());
    }

    @Test
    public void testContainsNode () throws Exception
    {
        LLNode node1 = new LLNode("Fido", new Dog ("Fido", "Lab", 4));
        LLNode node2 = new LLNode("Spot", new Dog ("Spot", "Beagle", 2));
        LinkedList list = new LinkedList(node1);
        list.prependNode(node2);

        assertFalse(list.containsNode("Harley"));
        assertTrue(list.containsNode("Spot"));
    }

    @Test
    public void testRemoveNode () throws Exception
    {
        LLNode node1 = new LLNode("Fido", new Dog ("Fido", "Lab", 4));
        LLNode node2 = new LLNode("Spot", new Dog ("Spot", "Beagle", 2));
        LLNode node3 = new LLNode("Harley", new Dog ("Harley", "Golden Retriever", 9));
        LinkedList list = new LinkedList(node1);
        list.prependNode(node2);

        assertTrue(list.removeNode("Spot"));
        assertFalse(list.removeNode("Harley"));
        assertEquals("#Dog{name:Fido breed:Lab age:4} -> \n", list.getString());

        list.prependNode(node3);
        list.removeNode("Fido");
        assertEquals("#Dog{name:Harley breed:Golden Retriever age:9} -> \n", list.getString());
    }

}
