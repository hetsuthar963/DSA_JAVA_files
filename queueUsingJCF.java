import java.util.*;
public class queueUsingJCF {
    public static void main(String args[]) {
        //error on line -> 5 below
        //Queue<Integer> q = new LinkedList<>();
        // Arraydeque
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
} 