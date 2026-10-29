package Oct29;

import java.util.*;

public class TreeSetTask {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        // 1. Test Insertion Order
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("Elements: " + set);
        System.out.println("Insertion Order: Sorted Order");

        // 2. Test Duplicate Elements
        set.add(10);

        System.out.println("After adding duplicate 10: " + set);
        System.out.println("Size: " + set.size());

        // 3. Test Sorting
        System.out.println("Before sorting: " + set);

        ArrayList<Integer> list = new ArrayList<>(set);
        java.util.Collections.sort(list);

        System.out.println("After sorting: " + list);

        // 4. Test Null Elements
        try {
            set.add(null);
        } catch (NullPointerException e) {
            System.out.println("Null elements are not allowed");
        }

        System.out.println("Contains null: " + set.contains(null));
    }
}