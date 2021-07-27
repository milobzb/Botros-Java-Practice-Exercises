package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {
        Scanner reader = new Scanner(System.in);
        FileUtility fileUtility = new FileUtility();

        System.out.print("Enter new file name: ");
        String filename = reader.nextLine();

        //replaceText is called in from FileUtility class with the the name of the file, word to be replaced, and the replacement for current word
        FileUtility.replaceText(filename, "utilize", "use");
    }

}
