package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    public void addFolder(String sitename, String author, String javascript, String css) {

        File siteFolder = new File("./website/" + sitename);
        if (!siteFolder.exists()) {
            siteFolder.mkdirs();
        }
        System.out.println("Created " + siteFolder.getPath());

        if (javascript.toLowerCase().equals("y")) { //creates a js folder based on user input
            File jsFolder = new File(siteFolder.getPath() + "/js"); //Folder js is created
            if (!jsFolder.exists()) {
                jsFolder.mkdirs();
            }
            System.out.println("Created " + jsFolder.getPath());
        }

        if (css.toLowerCase().equals("y")) {    //creates a css folder based on user input
            //Files.createDirectory("css");
            File cssFolder = new File(siteFolder.getPath() + "/css");   //Folder is created
            if (!cssFolder.exists()) {
                cssFolder.mkdirs();
            }
            System.out.println("Created " + cssFolder.getPath());
        }

        try {
            File indexHtml = new File(siteFolder.getPath() + "/index.html");    //Index file is then created with author name
            if (!indexHtml.exists()) {
                indexHtml.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter((new FileWriter(indexHtml)));    //HTML text is then written based on user input for author
            writer.append("<!Doctype html>\n");
            writer.append("<html>\n");
            writer.append("<head>\n");
            writer.append("<title>" + sitename + "</title>\n");
            writer.append("<meta name='author' content='" + author + "'>\n");
            writer.append("</head>\n");
            writer.append("<body>\n");
            writer.append("</body>\n");
            writer.append("</html>\n");
            writer.close();

            System.out.println("Created " + indexHtml.getPath());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
