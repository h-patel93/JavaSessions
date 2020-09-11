package CollectionAndGenerics;

import java.util.ArrayList;

public class CurrentTime {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        long start= System.currentTimeMillis();
        for(int i=1;i<1000000;i++)
        {
            a.add(i);
        }
        long end = System.currentTimeMillis() - start;
        System.out.println(end);
    }}
