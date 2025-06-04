// Binary file copy
import java.io.*;

public class ex10{
    public static void main(String[] args) {
        File src = new File("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg"); // Source file path
        File dest = new File("c:\\Temp\\copyimg.jpg"); // Destination file path
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            while ((c = fi.read()) != -1) {
                fo.write((byte)c);
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + " has been copied to " + dest.getPath() + ".");
        } catch (IOException e) {
            System.out.println("File copy error");
        }
    }
}