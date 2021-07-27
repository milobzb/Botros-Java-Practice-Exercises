package ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */

import java.util.List;


public class App {

    public static void main(String[] args) throws Exception {

        FileUtility fileUtility = new FileUtility(); //Utility that performs file read and write
        StringUtility stringUtility = new StringUtility(); //Utility that performs string operations
        String a = "exercise41_input.txt"; //a represents the input file being used
        List<String> names = fileUtility.readFile(a);   //List of names to be sorted

        fileUtility.writeFile("exercise41_output.txt", stringUtility.sortList(names));  //write sorted list to new file
    }

}