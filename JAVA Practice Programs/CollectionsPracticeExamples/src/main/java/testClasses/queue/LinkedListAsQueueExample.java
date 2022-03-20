package testClasses.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueueExample {
    public static void main(String args[]){
        Queue<Integer> linkedListAsQueue = new LinkedList<>();
        linkedListAsQueue.add(12);
        linkedListAsQueue.add(18);
        linkedListAsQueue.add(13);
        linkedListAsQueue.add(16);
        linkedListAsQueue.add(20);

        System.out.println("First Element of the queue is : "+linkedListAsQueue.peek());
        System.out.println("Removing the first elment of the queue : "+linkedListAsQueue.poll());
        System.out.println("First Element of the new queue is : "+linkedListAsQueue.peek());
    }
}
