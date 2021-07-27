package ex45;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtility {
    public static void replaceText( String filename, String sourceText, String replacementText ) throws IOException {
        Path path = Paths.get("exercise45_input.txt");  //Input file is located using Path
        Charset charset = StandardCharsets.UTF_8;

        String content = Files.readString(path, charset);   //content reads all characters in input file as a string
        content = content.replaceAll(sourceText, replacementText);  //content takes current word and replaces it with another

        Files.write(Path.of(filename), content.getBytes(charset));  //New string of words is placed into file
    }
}
