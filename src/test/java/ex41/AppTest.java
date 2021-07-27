package ex41;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    StringUtility stringUtility = new StringUtility();
    FileUtility fileUtility = new FileUtility();
    @Test
    public void testSortEmptyList()
    {
        List<String> emptyList = new ArrayList<String>();
        //List<String> resultList = App.sortNames(emptyList);
        List<String> resultList = stringUtility.sortList(emptyList);
        assertEquals(emptyList, resultList);
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSort()
    {
        List<String> unsortedNames = new ArrayList<String>();
        unsortedNames.add("Delta");
        unsortedNames.add("Charlie");
        unsortedNames.add("Alpha");
        unsortedNames.add("Bravo");

        List<String> sortedNames = new ArrayList<String>();
        sortedNames.add("Alpha");
        sortedNames.add("Bravo");
        sortedNames.add("Charlie");
        sortedNames.add("Delta");

        List<String> resultNames = stringUtility.sortList(unsortedNames);

        assertEquals(resultNames, sortedNames);
    }
}
