package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Create buffered reader object to take user input
        ProductSearch productSearchUtility = new ProductSearch();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Create string variable
        String input;
        System.out.print("What is the product name? ");
        String product = bufferedReader.readLine();
        System.out.println(productSearchUtility.searchProduct(product));
    }

}
