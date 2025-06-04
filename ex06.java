// Reading a Binary File with FileInputStream
import java.io.*;

public class ex06 {
    public static void main(String[] args) {
        byte b[] = new byte[6]; // Empty byte array
        try {
            FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
            int n = 0, c;
            while ((c = fin.read()) != -1) {
                b[n] = (byte)c;
                n++;
            }
            System.out.println("Printing the array read from c:\\Temp\\test.out:");
            for (int i = 0; i < b.length; i++)
                System.out.print(b[i] + " ");
            System.out.println();
            fin.close();
        } catch (IOException e) {
            System.out.println("Could not read from c:\\Temp\\test.out. Please check the path.");
        }
    }
}