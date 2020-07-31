package Array;

import java.util.Random;

public class EnhancedForLoop {
    public static void main(String args[]){
        Random r = new Random();
        int a[]=new int[7];
        for(int j=0;j<a.length;j++){
            a[j]=r.nextInt(50);

        }
        try{System.out.println(a[9]);
        }catch(Exception e)
        {
            System.out.println("maximum index is 7");
        }


        for (int i:a
        ) {
            System.out.println("values of array using enhanced for loop with random class "+i);

        }

    }
}
