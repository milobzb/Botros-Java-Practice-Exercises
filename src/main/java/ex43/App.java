package ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emanuel Botros
 */
import java.io.*;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Site name: ");
        String sitename = reader.nextLine();

        System.out.print("Author: ");
        String author = reader.nextLine();

        System.out.print("Do you want a folder for Javascript? ");
        String javascript = reader.nextLine();

        System.out.print("Do you want a folder for CSS? ");
        String css = reader.nextLine();

        folder(sitename, author, javascript, css);
    }
    public static void folder(String sitename, String author, String javascript, String css) {

        File siteFolder = new File("./website/" + sitename);
        if (!siteFolder.exists()) {
            siteFolder.mkdirs();
        }
        System.out.println("Created " + siteFolder.getPath());

        if (javascript.toLowerCase().equals("y")) {
            File jsFolder = new File(siteFolder.getPath() + "/js");
            if (!jsFolder.exists()) {
                jsFolder.mkdirs();
            }
            System.out.println("Created " + jsFolder.getPath());
        }

        if (css.toLowerCase().equals("y")) {
            //Files.createDirectory("css");
            File cssFolder = new File(siteFolder.getPath() + "/css");
            if (!cssFolder.exists()) {
                cssFolder.mkdirs();
            }
            System.out.println("Created " + cssFolder.getPath());
        }

        try {
            File indexHtml = new File(siteFolder.getPath() + "/index.html");
            if (!indexHtml.exists()) {
                indexHtml.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter((new FileWriter(indexHtml)));
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
