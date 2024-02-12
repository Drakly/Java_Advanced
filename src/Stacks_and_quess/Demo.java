package Stacks_and_quess;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {

        //stack = LIFO -> Last in First out!

        Deque<Integer> stack = new ArrayDeque<>();

       // stack.push(12);
       // stack.push(54);
        //stack.push(32);
        //stack.push(14);
        //stack.push(60);


        //queue = FIFO -> First In First out

        Deque<Integer> queue = new ArrayDeque<>();


        queue.offer(34);
        queue.offer(64);
        queue.offer(45);
        queue.offer(13);
        queue.offer(32);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println();


        //PriorityQueue =

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        priorityQueue.offer(23);
        priorityQueue.offer(53);
        priorityQueue.offer(12);
        priorityQueue.offer(69);
        priorityQueue.offer(55);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }



    }
}
