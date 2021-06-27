package ex44;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.*;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

public class App {
    public static void main(String[] args) throws Exception {
        //Create buffered reader object to take user input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //Create string variable
        String input;
        System.out.print("What is the product name? ");
        String product = bufferedReader.readLine();
        System.out.println(searchProduct(product));
    }

    public static String searchProduct(String productName) {
        //To read json file, first you need to add one external library
        //This is the library json-simple-1.1.1.jar
        //Create one json parser object
        JSONParser parser = new JSONParser();

        String searchResult = "";

        try {
            //Read json file using parser and store it in obj
            Object obj = parser.parse(new FileReader("exercise44_input.json"));
            //Create json object to read internal values
            JSONObject jsonObject = (JSONObject)obj;
            //Reading products array from  the file
            JSONArray subjects = (JSONArray)jsonObject.get("products");

            //Flag is used whether given string is present or not
            int flag = 0;

            //Create iterator for products array
            //Loop through the iterator
            for (Object subject : subjects) {
                JSONObject json = (JSONObject) subject;
                //Get the name value
                String name = (String) json.get("name");
                //Compare it with given input
                if (productName.equalsIgnoreCase(name)) {
                    searchResult += ("Name: " + name) + "\n";
                    searchResult += ("Price: " + json.get("price")) + "\n";
                    searchResult += ("Quantity: " + json.get("quantity")) + "\n";
                    flag = 1;
                }
            }
            //If flag value is zero, then value is not found
            if(flag == 0){
                searchResult = "Sorry, that product was not found in our inventory";
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return searchResult;
    }
}
