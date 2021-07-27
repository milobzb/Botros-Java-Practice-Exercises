package ex44;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest
{
    ProductSearch productSearchUtility = new ProductSearch();
    @Test
    public void testProductNotFound()
    {
        String expected = "Sorry, that product was not found in our inventory";
        String result = productSearchUtility.searchProduct("Unknown");
        assertEquals(expected, result);

    }

    @Test
    public void testProductFound()
    {
        String expected = "Name: Widget\n" +
                          "Price: 25.0\n" +
                          "Quantity: 5\n";
        String result = productSearchUtility.searchProduct("Widget");
        assertEquals(expected, result);

    }

}