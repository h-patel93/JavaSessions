package Array;

public class JaggedArray {
    public static void main(String args[]){
        int a[][]={
            {6,7,8,9},
            {7,8},
            {3,5,6}
        };
        for (int i[]:a
             ) {
            for (int j:i
                 ) {
                System.out.print(j+" ");
            }
            System.out.println();

        }

        int p[][] = new int[3][];
        p[0] = new int[4];
        p[1]=new int[2];
        p[2]=new int[3];


    }
}
