package Sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_Set_Demo {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(5);
        sortedSet.add(8);
        System.out.println(sortedSet); // prints [5, 8, 10]
        System.out.println(sortedSet.first()); // prints 5
        System.out.println(sortedSet.last()); // prints 10
        SortedSet<Integer> subset = sortedSet.headSet(9);
        System.out.println(subset); // prints [5, 8]
    }
}
