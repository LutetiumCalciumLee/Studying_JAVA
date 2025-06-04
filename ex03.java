// Reading a Korean Text File (When the Character Set is Incorrectly Specified)
import java.io.*;

public class ex03 {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            // Specify an intentionally incorrect character set to demonstrate the effect of a wrong encoding
            fin = new FileInputStream("c:\\WTemp\\hangul.txt");
            in = new InputStreamReader(fin, "US-ASCII"); // Intentionally incorrect character set
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