// Output Using Buffered Streams
import java.io.*;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("c:\\Temp\\test2.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
            while ((c = fin.read()) != -1) {
                out.write(c); // Characters are displayed on the screen when the buffer is full
            }

            // At this point, all file data has not yet been output
            new Scanner(System.in).nextLine(); // Wait for <Enter> key
            out.flush(); // Output any remaining characters in the buffer
            out.close();
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}