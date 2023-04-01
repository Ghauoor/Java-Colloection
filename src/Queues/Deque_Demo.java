package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Demo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerLast(4);

        deque.pollFirst();
        deque.pollLast();

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque);
    }
}
