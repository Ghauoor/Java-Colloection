package Iterators;

import java.util.Iterator;

public class TestOurGenericList {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        for (int val :
                list) {
            System.out.println(val);
        }
    }
}
