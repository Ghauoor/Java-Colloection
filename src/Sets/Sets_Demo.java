package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets_Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);


        System.out.println(set);


        //###########################################################

        //create set from arraylist
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);

        Set<Integer> listSet = new HashSet<>(list);

        System.out.println(listSet);
        //##############################################################

        System.out.println("After applying retainAll() :");
        set.retainAll(listSet);
        System.out.println(set);
        System.out.println(listSet);

        System.out.println();
        //###############################################################
        //System.out.println("After applying removeAll() :");
        //set.removeAll(listSet);
        //System.out.println(set);

        //###############################################################
        System.out.println("After applying addAll() :");
        set.addAll(listSet);
        System.out.println(set);


        //#########################################################
        //traverse
        //hashset do not follow any ordering

        for (int num :
                set) {
            System.out.print("[ " + num + " ]");
        }

    }


}
