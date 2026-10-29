package Oct29;
import java.util.*;

public class CollectionTask {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(null);

        System.out.println("ArrayList: " + list);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(30);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(null);

        System.out.println("LinkedList: " + linkedList);

        HashSet<Integer> set = new HashSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(null);

        System.out.println("HashSet: " + set);

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(30);
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(10);
        linkedSet.add(null);

        System.out.println("LinkedHashSet: " + linkedSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println("TreeSet: " + treeSet);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Apple");
        map.put(null, "Orange");
        map.put(4, null);

        System.out.println("HashMap: " + map);

        LinkedHashMap<Integer, String> linkedMap =
                new LinkedHashMap<>();
        linkedMap.put(1, "Apple");
        linkedMap.put(2, "Mango");
        linkedMap.put(3, "Apple");
        linkedMap.put(null, "Orange");
        linkedMap.put(4, null);

        System.out.println("LinkedHashMap: " + linkedMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Mango");
        treeMap.put(2, "Apple");
        treeMap.put(4, null);

        System.out.println("TreeMap: " + treeMap);
    }
}