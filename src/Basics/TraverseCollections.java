package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseCollections {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Naruto ");
        stringArrayList.add("Hinata ");
        stringArrayList.add("Luffy ");
        stringArrayList.add("Saitama ");
        stringArrayList.add("Nami ");


        //for each loop
        for (String str :
                stringArrayList) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer stringBuffer = new StringBuffer(str);
            System.out.println(stringBuffer.reverse());
        }
        System.out.println("_______________________________________________________________");
        //traversing using iterator

        //Iterator Object
        Iterator<String> names = stringArrayList.iterator();

        while (names.hasNext()) {
            String nextName = names.next();
            System.out.println(nextName);
        }

        System.out.println("_______________________________________________________________");

        //Backward traversal with ListIterator
        ListIterator<String> listIterator = stringArrayList.listIterator(stringArrayList.size());

        while (listIterator.hasPrevious()) {
            String n = listIterator.previous();
            System.out.println(n);
        }

        System.out.println("_______________________________________________________________");

        //For each Method
        names.forEachRemaining(name -> {
            System.out.println(name);
        });

        System.out.println("_______________________________________________________________");


        TreeSet<String> set = new TreeSet<>();
        set.addAll(stringArrayList);
        set.forEach(e -> {
            System.out.println(e);
        });

    }
}
