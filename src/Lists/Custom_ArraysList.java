package Lists;

import java.util.ArrayList;
import java.util.List;

public class Custom_ArraysList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        //Coping the Element of List
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        arrayList.addAll(list);
        System.out.println("Copy List is :" + arrayList);


        //Change the Val of list
        System.out.println("The Got change is " + list.set(1, 100));

        System.out.println(list);


        //TODO: Boxing and Unboxing

        /**
         *indexOf method take object ideal we should pass new Integer(2)
         * but with help of boxing and Unboxing
         * Compailer take care of it
         */

        //Sublist give us just view of part of list
        //so any changes in sublist has direct impact on main list
        //Shallow Copy --> Sublist
        System.out.println("Sublist of list : " + arrayList.subList(1, 4));

        System.out.println("index is 100 is : " + list.indexOf(100));


    }
}
