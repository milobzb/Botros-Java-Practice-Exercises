package ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileNotFoundException;


public class App {

    public static void main(String[] args) throws Exception {

        String a = "exercise41_input.txt";
        List<String> names = readFile(a);

        writeFile("exercise41_output.txt", sortNames(names));
    }

    public static List<String> readFile(String a) throws IOException
    {
        String namesInput;
        List<String> names = new ArrayList<String>();
        File reader = new File(a);
        BufferedReader br = new BufferedReader(new FileReader(a));
        while ((namesInput = br.readLine()) != null) {
            names.add(namesInput);
        }
        br.close();
        return names;
    }

    public static List<String> sortNames(List<String> names)
    {
        Collections.sort(names);
        return names;
    }

    public static void writeFile(String fileName, List<String> names) throws IOException
    {
        FileWriter fileWriter = new FileWriter(fileName);
        PrintWriter out = new PrintWriter(fileWriter);

        out.println("Total of " + names.size() + " names\n-----------------");
        for (String outputLine : names) {
            out.println(outputLine);
        }
        out.flush();
        out.close();
        fileWriter.close();
    }
}