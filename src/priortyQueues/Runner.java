package priortyQueues;

import java.util.PriorityQueue;

public class Runner {

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue();
        pq.add("banana");
        pq.add("kiwi");
        pq.add("mango");
        pq.add("apple");
        System.out.println(pq);
        System.out.println(pq.remove());
        PriorityQueue<Integer> pr = new PriorityQueue();
        //add in any order
        pr.add(10);
        pr.add(12);
        pr.add(11);
        pr.add(14);
        pr.add(15);
        System.out.println(pr);
        //remove in proper order
        //small num high priority
        System.out.println(pr.remove());
        System.out.println(pr.remove());
        System.out.println(pr.remove());
    }
}
