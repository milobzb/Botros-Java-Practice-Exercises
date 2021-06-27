package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter new file name: ");
        String filename = reader.nextLine();

        thepath(filename);
    }
    public static void thepath( String filename ) throws IOException{
        Path path = Paths.get("exercise45_input.txt");
        Charset charset = StandardCharsets.UTF_8;

        String content = Files.readString(path, charset);
        content = content.replaceAll("utilize", "use");

        Files.write(Path.of(filename), content.getBytes(charset));
    }
}
