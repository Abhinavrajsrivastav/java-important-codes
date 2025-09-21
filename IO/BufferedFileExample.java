package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedFileExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Writing to file using BufferedWriter
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Hello, this is a test using BufferedWriter.\n");
            bw.write("BufferedWriter is more efficient than FileWriter.");

            bw.close(); 
            fw.close();
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

            br.close(); // Always close BufferedReader
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading.");
            e.printStackTrace();
        }
    }
}
