package Comparators;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Test_Comparator {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(new MyCustomComparator());

        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);

        List<Integer> topEle = new ArrayList<>();

        int index = 0;

        while (!pq.isEmpty()) {
            if (index == 2)
                break;
            topEle.add(pq.poll());
            index++;
        }
        System.out.println(topEle);
    }
}
