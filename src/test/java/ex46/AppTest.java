package ex46;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ex46.App;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testCountWords()
    {
        try {
            String expected = "badger *******\n" +
                    "mushroom **\n" +
                    "snake *\n";
           String result = App.countWords();
           assertEquals(expected, result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}