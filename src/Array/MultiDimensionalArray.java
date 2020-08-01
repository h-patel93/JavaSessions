package Array;

public class MultiDimensionalArray {
    public static void main(String args[]){
        int z[][][]= new int[4][4][4];

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                for (int k =0;k<4;k++){
                    z[i][j][k]=i+j;
                }
            }
        }

        for (int i[][]:z
             ) {
            for (int j[]:i
                 ) {
                for (int k:j
                     ) {
                    System.out.print(k+" ");

                }
                System.out.println();

            }
            System.out.println();

        }
    }
}
