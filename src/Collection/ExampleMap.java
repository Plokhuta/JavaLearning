package Collection;

import java.util.HashMap;
import java.util.Map;

public class ExampleMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one1");
        map.put(2, "one2");
        map.put(3, "one3");
        map.put(4, "one4");

        String key = map.get(2);
        System.out.println(key);

        map.remove(2);

        System.out.println("-----------------------------------");


        for(int key2: map.keySet()){
            System.out.println(key2);
        }

        System.out.println("-----------------------------------");


        for(String val: map.values()){
            System.out.println(val);
        }

        System.out.println("-----------------------------------");

        System.out.println(map.containsKey(2));
    }
}
