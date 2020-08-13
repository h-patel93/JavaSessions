package FileHandlingDemo;

import java.io.*;

public class DemoFileHandling {
    public static void main(String args[]) throws IOException {
        File f = new File("Demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo Content");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
       String str= dis.readUTF();
        System.out.println(str);

    }
}
