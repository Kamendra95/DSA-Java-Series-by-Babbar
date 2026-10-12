package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[]args){
        Queue<Integer> pq = new PriorityQueue<>();
        // default behaviour -> Integers -> less value -> high priority
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq.poll());
    }
}
