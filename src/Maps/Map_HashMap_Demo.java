package Maps;

import java.util.*;

public class Map_HashMap_Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);

        System.out.println(map.get("A"));
        /**
         * If Value is not present it will return null which can lead
         * to a null pointer exception
         * */
        System.out.println(map.get("N"));

        //Solution of this problem is getOrDefault method

        System.out.println(map.getOrDefault("N", 0));
        System.out.println(map.containsKey("A"));

        map.remove("A");


        /**
         * Creating a adjacency list to traverse graphs
         *
         * */

        Map<Integer, List<Integer>> adj = new HashMap<>();

        /**
         *   1 - 2
         *   3 - 5
         *   1 - 3
         *
         *   Structure of graph
         */

//        if (adj.get(1) == null)
//            adj.put(1, new ArrayList<>());
//
//        adj.get(1).add(2);

        //Instead of writing these lines we have method
        /**
         * Working of computeIfAbsent Func
         * it take integer as key and fun which is
         * a lambda func which create a new ArraysList and return
         * ArrayList
         */

        adj.computeIfAbsent(1, f -> new ArrayList<>()).add(2);

        //##########################################################

        //Traversal of Map

        //This Method simply convert Map into Set
        //Set is Collection so it Iterable
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry :
                entrySet) {
            System.out.println(entry.getKey() + " ," + entry.getValue());

        }

        //Another method

        Set<String> keySet = map.keySet();

        for (String key :
                keySet) {
            System.out.println(key + ", " + map.get(key));
        }

    }


}
