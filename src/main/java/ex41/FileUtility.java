package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {

    /*
    @Param fileName: name of file
    @Returns list of names from input file
     */
    public List<String> readFile(String fileName) throws IOException
    {
        String namesInput;
        List<String> names = new ArrayList<String>();
        File reader = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(fileName)); //buffer stream for input file name
        while ((namesInput = br.readLine()) != null) {
            names.add(namesInput); //add input names to a list
        }
        br.close(); //close buffer stream after reading file contents
        return names;
    }

    /*
    @Param fileName: name of file to write data into
    @Param names: list of names to be written to file
    @Returns void
     */
    public void writeFile(String fileName, List<String> names) throws IOException
    {
        FileWriter fileWriter = new FileWriter(fileName); //file writer stream to read/write file
        PrintWriter out = new PrintWriter(fileWriter);

        out.println("Total of " + names.size() + " names\n-----------------");
        for (String outputLine : names) {
            out.println(outputLine);
        }
        out.flush();
        out.close(); //close the open file resources
        fileWriter.close();
    }
}
