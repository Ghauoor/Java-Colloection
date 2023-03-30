package Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        ListIterator<Integer> listIterator = linkedList.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());


        System.out.println(listIterator.hasNext());

        System.out.println(listIterator.previous());

    }
}
