package StringExamples;

import java.io.IOException;
import java.util.Scanner;

public class ReadMethod {
    public static void main(String arg[]) throws IOException
    {
        int i = System.in.read();
        System.out.println("value"+ (char)i);

        String str = "";
        while((i = System.in.read()) != 48)
        {
            str = str + (char)i;
        }
        System.out.println(str);




    }
  static
    {
        Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        System.out.println(h);
    }
}
