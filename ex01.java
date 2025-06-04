// Reading a Text File with FileReader
import java.io.*;

public class ex01 {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("c:\\Windows\\System.ini");
            int c;
            while ((c = fin.read()) != -1) { // Read characters one by one until the end of the file
                System.out.print((char)c);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("Input/output error");
        }
    }
}