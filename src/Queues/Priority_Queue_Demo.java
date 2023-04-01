package Queues;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priority_Queue_Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(0);
        priorityQueue.offer(100);

        List<Integer> list = new ArrayList<>();
        int index = 0;
        while (!priorityQueue.isEmpty()) {
            if (index == 2) {
                break;
            }
            list.add(priorityQueue.poll());
            index++;
        }

        System.out.println(list);
        System.out.println(priorityQueue);
    }
}
