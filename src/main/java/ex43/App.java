package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        FileUtility fileUtility = new FileUtility();
        Scanner reader = new Scanner(System.in);

        System.out.print("Site name: ");
        String sitename = reader.nextLine();

        System.out.print("Author: ");
        String author = reader.nextLine();

        System.out.print("Do you want a folder for Javascript? ");
        String javascript = reader.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        String css = reader.nextLine();

        fileUtility.addFolder(sitename, author, javascript, css);   //Takes in site name, author, and option for folders
    }
}
