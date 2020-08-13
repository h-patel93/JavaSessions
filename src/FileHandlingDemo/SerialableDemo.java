package FileHandlingDemo;

import java.io.*;

public class SerialableDemo {
    public static void main(String args[]) throws Exception {
        Save s = new Save();
        s.i=555;
      //  Save ss = new Save();

        File f = new File("DemoSerializable");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
       Save ss= (Save) ois.readObject();

        System.out.println(ss.i);

    }

}
class Save implements Serializable
{
    int i;
}
