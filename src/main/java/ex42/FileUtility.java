package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtility {
    public String parseFile(String fileName) throws FileNotFoundException {
        // Scan the file and use delimiters: , (comma) and \r\n (new line)
        Scanner reader = new Scanner(new File(fileName));
        reader.useDelimiter("(,)|(\\r\\n)");

        String lastName, firstName, salary;
        String formattedResult = "Last      First     Salary    \n------------------------------\n";
        // Loop through the file line by line
        while (reader.hasNextLine()) {
            // Read the three values in each line
            lastName = reader.next();
            firstName = reader.next();
            salary = reader.next();

            // Format the string for each line (10 characters per value, left aligned)
            formattedResult += String.format("%-10s%-10s%-10s\n", lastName, firstName, salary);
        }
        reader.close();
        return formattedResult;
    }
}
