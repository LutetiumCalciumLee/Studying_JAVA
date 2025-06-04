// Text file copy
import java.io.*;

public class ex09 {
    public static void main(String[] args) {
        File src = new File("c:\\windows\\system.ini"); // Source file path
        File dest = new File("c:\\Temp\\system.txt");   // Destination file path
        int c;
        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);
            while ((c = fr.read()) != -1) { // Read one character
                fw.write((char)c);          // Write one character
            }
            fr.close();
            fw.close();
            System.out.println(src.getPath() + " has been copied to " + dest.getPath() + ".");
        } catch (IOException e) {
            System.out.println("File copy error");
        }
    }
}