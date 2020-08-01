package Array;

import java.util.Random;

public class TwoDimArray {
    public static void main(String args[]){
        Random r = new Random();
        int array[][]= { {7,8,9,10},
                         {3,4,5,6},
                          {4,5,6,7}

        };

        int array1[][]=new int[3][5];

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                array1[i][j]=r.nextInt(50);

            }

        }


        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
