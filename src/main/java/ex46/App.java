package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args)  {
        FileUtility fileUtility = new FileUtility();
        try {       //Input file is opened and then used in countWords method in fileUtility class
            System.out.println(fileUtility.countWords("exercise46_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
