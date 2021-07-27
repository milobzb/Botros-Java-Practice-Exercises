package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class FileUtility {
    public String countWords(String fileName) throws FileNotFoundException {
        // Scan the file and use delimiters: , (comma) and \r\n (new line)
        Scanner reader = new Scanner(new File(fileName));
        reader.useDelimiter("( )|(\\r\\n)");

        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

        String result = "";

        // Loop through the file line by line
        while (reader.hasNext()) {
            // Read the word and if it's not already in the map, add it
            String word = reader.next();

            // Increment the count for the word in the map
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
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
