package CollectionAndGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("name","harsh");
        map.put("lastnme","patel");

        Set<String> key = map.keySet();
        for (String keys:key)
        {
            System.out.println(keys + "values of key"+ map.get(keys));
        }
    }
}
