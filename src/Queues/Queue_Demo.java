package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo {
    public static void main(String[] args) {
        //FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

    }
}
