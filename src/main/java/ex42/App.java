package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.FileNotFoundException;


public class App
{
    public static void main( String[] args ) {

        FileUtility fileUtility = new FileUtility();
        try
        {
            String result = fileUtility.parseFile("exercise42_input.txt"); //Takes in parseFile method and prints input file in ascending order
            System.out.println(result);
        } catch (FileNotFoundException e)   //If file input does not exist, the following message is printed
        {
            System.out.println("File does not exist");
        }
    }
}
