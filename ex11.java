// High-Speed Block-Based Binary File Copy
import java.io.*;

public class ex11 {
    public static void main(String[] args) {
        File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg"); // Source file path
        File dest = new File("c:\\Temp\\desert.jpg"); // Destination file path
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte[] buf = new byte[1024 * 10]; // 10KB buffer
            while (true) {
                int n = fi.read(buf); // Read up to buffer size. n is the actual number of bytes read
                fo.write(buf, 0, n);  // Write n bytes from buf[0]
                if (n < buf.length)
                    break;
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + " has been copied to " + dest.getPath() + ".");
        } catch (IOException e) {
            System.out.println("File copy error");
        }
    }
}