package Maps;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Sorted_Maps_Demo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> treeMap =
                new TreeMap<>(
                        (a, b) -> b - a
                );

        treeMap.put(1, "A");
        treeMap.put(2, "B");
        treeMap.put(3, "c");
        treeMap.put(4, "D");

        //System.out.println(treeMap);

        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();

        for (Map.Entry<Integer, String> entry :
                entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.ceilingKey(3));
    }
}
