package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args)  {
        try {
            System.out.println(countWords());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String countWords() throws FileNotFoundException{
        // Scan the file and use delimiters: , (comma) and \r\n (new line)
        Scanner reader = new Scanner(new File("exercise46_input.txt"));
        reader.useDelimiter("( )|(\\r\\n)");

        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

        String result = "";

        // Loop through the file line by line
        while (reader.hasNext()) {
            // Read the word and if it's not already in the map, add it
            String word = reader.next();
            if (!wordMap.containsKey(word))
            {
                wordMap.put(word, 0);
            }

            // Increment the count for the word in the map
            wordMap.put(word, wordMap.get(word) + 1);
        }
        HashMap<String, Integer> sortedMap = wordMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap:: new));
        // Print the contents of the map
        for (String word : sortedMap.keySet())
        {
            String stars = "";
            for (int i = 0, l = sortedMap.get(word); i < l; ++i)
            {
                stars += "*";
            }
            result += (word + " " + stars) + "\n";
        }

        return result;
    }
}
