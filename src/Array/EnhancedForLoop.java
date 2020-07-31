package Array;

public class EnhancedForLoop {
    public static void main(String args[]){
        int a[]=new int[7];
        for(int j=0;j<7;j++){
            a[j]=j+4;

        }

        for (int i:a
        ) {
            System.out.println("values of array using enhanced for loop"+i);

        }

    }
}
