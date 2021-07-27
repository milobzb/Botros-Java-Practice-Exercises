package ex43;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.io.File;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    FileUtility fileUtility = new FileUtility();
    @Test
    public void testFolderExists()
    {
        try {
            fileUtility.addFolder("test1234", "author123", "y", "y");
            String expectedPath = ".\\website\\test1234\\js";
            File file = new File(expectedPath);
            assertTrue(file.exists());
        } catch(Exception e){};

    }

}
