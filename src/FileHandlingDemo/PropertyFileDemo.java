package FileHandlingDemo;
import java.io.*;
import java.util.Properties;

public class PropertyFileDemo {
    public static void main(String args[]) throws IOException {
        Properties p = new Properties();
     /*   OutputStream os = new  FileOutputStream("dataConfig.properties");
        p.setProperty("url","localhost:3306/myDb");
        p.setProperty("uname","navin");
        p.setProperty("password","0000");
        p.store(os,null);*/

        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);
        System.out.println( p.getProperty("uname"));
        System.out.println(  p.getProperty("url"));
        System.out.println(p.getProperty("password"));

p.list(System.out);



    }
}
