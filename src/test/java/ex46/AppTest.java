package ex46;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.IOException;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    FileUtility fileUtility = new FileUtility();
    @Test
    public void testCountWords()
    {
        try {
            String expected = "badger *******\n" +
                    "mushroom **\n" +
                    "snake *\n";
           String result = fileUtility.countWords("exercise46_input.txt");
           assertEquals(expected, result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}