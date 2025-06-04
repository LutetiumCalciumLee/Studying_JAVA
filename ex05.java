// Writing a Binary File with FileOutputStream
import java.io.*;

public class ex05 {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try {
            FileOutputStream fout =
                new FileOutputStream("c:\\WTemp\\test.out");
            for(int i = 0; i < b.length; i++)
                fout.write(b[i]); // Write each byte of array b as binary
            fout.close();
        } catch(IOException e) {
            System.out.println("Could not save to c:\\WTemp\\test.out. Please check the path.");
            return;
        }
        System.out.println("Saved to c:\\WTemp\\test.out.");
    }
}