package ex45;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ex45.App;
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
    public void testPath()
    {
        try {

            Charset charset = StandardCharsets.UTF_8;
            App.thepath("testFile");
            Path path = Paths.get("testFile");
            String content = Files.readString(path, charset);
            boolean noUtilize = !content.contains("utilize");
           assertTrue(noUtilize);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}