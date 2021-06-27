package ex42;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testParseFile()
    {
        try {
            String result = App.parseFile("exercise42_input.txt");
            String expected = "Jones     Aaron     46000";
            assertTrue(result.contains(expected));
        } catch(Exception e){};

    }

}
