package ex44;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ex44.App;
import org.junit.Test;

import java.io.File;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testProductNotFound()
    {
        String expected = "Sorry, that product was not found in our inventory";
        String result = App.searchProduct("Unknown");
        assertEquals(expected, result);

    }

    @Test
    public void testProductFound()
    {
        String expected = "Name: Widget\n" +
                          "Price: 25.0\n" +
                          "Quantity: 5\n";
        String result = App.searchProduct("Widget");
        assertEquals(expected, result);

    }

}