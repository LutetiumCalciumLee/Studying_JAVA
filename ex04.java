// Saving Keyboard Input to a File
import java.io.*;
import java.util.*;

public class ex04 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        FileWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            writer = new FileWriter("C:\\WTemp\\output.txt");
            String line;
            System.out.println("Enter text (type 'exit' to finish):");
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line + "\n");
            }
            reader.close();
            writer.close();
            System.out.println("Input has been saved to the file.");
        } catch (IOException e) {
            System.out.println("Input/output error");
        }
    }
}