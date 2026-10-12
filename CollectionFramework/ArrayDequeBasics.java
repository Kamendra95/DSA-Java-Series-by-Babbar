package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics {
    public static void main(String[]args){
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offerFirst(05);
        q.offerLast(40);
        
        System.out.println(q);
    }
}
