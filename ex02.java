// Reading a Korean Text File with InputStreamReader
import java.io.*;

public class ex02 {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("c:\\Temp\\hangul.txt");
            in = new InputStreamReader(fin, "UTF-8"); // Complete Hangul character set made by MS
            int c;

            System.out.println("Encoding character set: " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("Input/output error");
        }
    }
}