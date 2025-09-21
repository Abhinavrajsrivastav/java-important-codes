import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class IOException {
    public static void main(String[] args) {
        try {
            // Trying to open a file that might not exist
            FileReader fr = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            System.out.println("First line: " + line);

            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}
