package Sets;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set_Demo {
    public static void main(String[] args) {
        Set<Animals> animalsSet = new TreeSet<>(
                (s1, s2) -> s2.getAge() - s1.getAge()
        );
        animalsSet.add(new Animals("Tommy", 2));
        animalsSet.add(new Animals("Alpha", 6));
        animalsSet.add(new Animals("koko", 3));
        animalsSet.add(new Animals("Brace", 5));

        for (Animals animal :
                animalsSet) {
            // System.out.println(animal + " , ");
        }

        //###########################################################

        NavigableSet<Integer> treeSet =
                new TreeSet<>();

        treeSet.add(8);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(0);

        for (int tS :
                treeSet) {
            System.out.print("[ " + tS + " ]");
        }

        System.out.println(treeSet.floor(2));
        System.out.println(treeSet.higher(2));
        System.out.println(treeSet.ceiling(2));
        System.out.println(treeSet.lower(2));

    }
}
