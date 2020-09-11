package CollectionAndGenerics;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        /*
       /* int values[] = new int[4];
        values[0]=2;
        values[3] = 5;

        Object value1[]  =new Object[5];
        value1[0]="harsh";
        value1[3]=5;
        System.out.println(value1[2]);


        //System.out.println(values[2]);*/

       /* Collection<Integer> c = new ArrayList<Integer>();

        //c.add("harsh");
        c.add(5);
        c.add(56);
        c.add(53);
        c.remove(5);
       // c.add(5.5f);

     /*   Iterator i = c.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
//cannot add elements in particular index position

        for(Object i : c)
        {
            System.out.println(i);
        } */

         /* int values[] = new int[4];
        values[0]=2;
        values[3] = 5;

        Object value1[]  =new Object[5];
        value1[0]="harsh";
        value1[3]=5;
        System.out.println(value1[2]);


        //System.out.println(values[2]);*/

        List<Integer> c = new ArrayList<Integer>();

        //c.add("harsh");
        c.add(5);
        c.add(56);
        c.add(53);
        //c.remove(5);
        c.add(1,45);
        // c.add(5.5f);

     /*   Iterator i = c.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }
//cannot add elements in particular index position

*/


        Collections.sort(c,(integer, t1) ->  {
            return integer%10>t1%10?1:-1;
        });


c.forEach(System.out::println);

        for(Object i : c)
        {
            System.out.println(i);
        }
    }
}

