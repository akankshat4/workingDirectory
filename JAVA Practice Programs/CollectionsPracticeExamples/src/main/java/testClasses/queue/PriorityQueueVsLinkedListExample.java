package testClasses.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueVsLinkedListExample {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(12);
        linkedList.add(32);
        linkedList.add(56);
        linkedList.add(67);
        linkedList.add(45);

        System.out.println("***** Linked List *****");
        for(int temp : linkedList){
            System.out.println(temp);
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
            });

        priorityQueue.add(12);
        priorityQueue.add(32);
        priorityQueue.add(56);
        priorityQueue.add(67);
        priorityQueue.add(45);

        System.out.println("***** Priority Queue *****");
        for(int temp1 : priorityQueue){
            System.out.println(temp1);
        }
    }
}
