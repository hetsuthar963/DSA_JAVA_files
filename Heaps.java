import java.util.PriorityQueue;
import java.util.Comparator;

public class Heaps {
    
    public static void main(String args[]) {
        //normal priority (lower value -> higher priority)
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        //reverse priority (higher value -> higher priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(3);// O(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek());// O(1)
            pq.remove();// O(logn)
        }
    }
}