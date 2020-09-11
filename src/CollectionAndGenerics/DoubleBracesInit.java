package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleBracesInit {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(56,47,45,46);
       // values.add(67);
        //values.add(57);
        //values.add(44);
        List<Integer> values35 = new ArrayList()
        {{add(56);
        add(68);
        add(69);}};




        for(Integer i : values35)
        {
            System.out.println(i);
        }

    }
}
