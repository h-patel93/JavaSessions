package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElimentsArrayList {

    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        persons.add("harsh");
        persons.add("nirav");
        persons.add("harsh");
        persons.add("gajju");
        persons.add("gajju");

        Set<String> names = new HashSet<>();


        for(String s:persons)
        {
            if(names.add(s)==false) {
                System.out.println(s);
            }
        }
    }
}
