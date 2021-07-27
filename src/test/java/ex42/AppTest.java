package ex42;


import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    FileUtility fileUtility = new FileUtility();
    @Test
    public void testParseFile()
    {
        try {
            String result = fileUtility.parseFile("exercise42_input.txt");
            String expected = "Jones     Aaron     46000";
            assertTrue(result.contains(expected));
        } catch(Exception e){};

    }

}
