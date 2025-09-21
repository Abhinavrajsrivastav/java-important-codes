package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Filew {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            file.createNewFile();
                System.out.println("File created: " + file.getName());
             FileWriter writer = new FileWriter(file);
                writer.write("Hello, this is a test.");
                writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try{
            FileReader r = new FileReader(file);
            int i;
            while((i=r.read())!=-1){
                System.out.print((char) i);
            }
        } catch(IOException e){
            System.out.println("An error occurred.");
            //this method is used to print the exception details
            e.printStackTrace();
        }
    }
}
