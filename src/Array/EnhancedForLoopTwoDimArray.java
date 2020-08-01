package Array;

import java.util.Random;

public class EnhancedForLoopTwoDimArray {
    public static void main(String args[]){
        Random r = new Random();
        int a[][]=new int[4][5];

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++){
                a[i][j]=r.nextInt(59);

            }
        }
        for (int i[]:a) {
            for (int j:i) {
                System.out.print(j+" ");

            }
            System.out.println();

        }

    }

}
