package IO;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Writing to file using PrintWriter
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello, this is a test using PrintWriter.");
            pw.println("PrintWriter allows easy formatted writing.");

            pw.close(); // Always close PrintWriter
        } catch (IOException e) {
            System.out.println("An error occurred while writing.");
            e.printStackTrace();
        }

        // Reading from file using BufferedReader
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
}
