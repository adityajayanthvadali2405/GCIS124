package unit01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static void info (String filename) {
        File file = new File (filename);
        System.out.println ("Name: " + file.getName ());
        System.out.println ("Absolute Path: " + file.getAbsolutePath ());
        System.out.println ("Exists? " + file.exists ());
        System.out.println ("Length: " + file.length ());
    }

    public static void printFile (String filename) {
        // Use try with resources

        try (FileReader fr = new FileReader (filename);
             BufferedReader reader = new BufferedReader (fr)) {

            // String line = reader.readLine ();
            // while (line != null) {
            //     System.out.println (line);
            //     line = reader.readLine ();
            // }

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println (line);
            }
        } catch (IOException ioe) {
            System.out.println ("Something bad happened, exiting");
        }
    }

    public static void main (String[] args) {
        info ("data/digit.txt");
        printFile ("data/alice.txt");
    }
}
