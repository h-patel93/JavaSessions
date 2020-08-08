package StringExamples;

import java.util.Scanner;

public class StringOperations {
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
       s1= sc.nextLine();
       s2=sc.nextLine();

       //Concatination of string
        String s3 = s1+s2;
        String s4 = s1.concat(s2);

        //Length of String
        int length1 = s1.length();
        int length2 = s2.length();

        //to upper case
        String s5 = s1.toUpperCase();

        System.out.println("Concating two strings = "+s3+"...............Length of "+s1+" is"+length1 +" Length of"+s2+" is" +length2+"................"+s1+" To upper case is "+s5);

    }
}
