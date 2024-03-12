package Test;

import Core.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {

    @Test
    public void testGetString () throws Exception
    {
        Dog testDog = new Dog("Fido", "Lab", 4);
        assertEquals("#Dog{name:Fido breed:Lab age:4}", testDog.getString());
    }

}
