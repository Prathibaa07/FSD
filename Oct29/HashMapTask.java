package Oct29;

import java.util.*;

public class HashMapTask {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // 1. Add Elements
        map.put(1, "Ravi");
        map.put(2, "Vijay");
        map.put(3, "Ajay");
        map.put(4, "Arun");

        System.out.println("Elements: " + map);

        // 2. Remove Element
        map.remove(2);

        System.out.println("After removing 2: " + map);

        // 3. Reverse
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());

        java.util.Collections.reverse(keys);

        System.out.println("Reversed:");

        for (int key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // 4. Display
        System.out.println("HashMap: " + map);
    }
}