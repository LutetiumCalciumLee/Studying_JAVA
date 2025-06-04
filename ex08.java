// File Management Using the File Class
import java.io.File;

public class ex08 {
    public static void listDirectory(File dir) {
        System.out.print("----- " + dir.getPath() + "'s file list -----\n");
        File[] subFiles = dir.listFiles();
        for (int i = 0; i < subFiles.length; i++) {
            File f = subFiles[i];
            long t = f.lastModified();
            System.out.print(f.getName());
            System.out.printf("\tFile size: %d\tLast modified: %tF %tT\n", f.length(), t, t);
            System.out.printf("\tIs directory: %b\tIs file: %b\tIs hidden: %b\n", f.isDirectory(), f.isFile(), f.isHidden());
        }
    }

    public static void main(String[] args) {
        File f1 = new File("c:\\windows\\system.ini");
        System.out.println("Parent directory: " + f1.getParent() + ", " + f1.getName());

        String res = "";
        if (f1.isFile())
            res = "file";
        else if (f1.isDirectory())
            res = "directory";
        System.out.println(f1.getPath() + " is a " + res + ".");

        File f2 = new File("c:\\WTemp\\java_sample");
        if (!f2.exists())
            f2.mkdirs(); // Create directory if it does not exist

        listDirectory(new File("c:\\WTemp"));
        f2.renameTo(new File("c:\\WTemp\\javasample"));
        listDirectory(new File("c:\\WTemp"));
    }
}