import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class queueReversal{
    public  static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());//pushing ele in stack by removing it from queue
        }

        while(!s.isEmpty()){
            q.add(s.pop());//adding ele in queue by poping it from stack
        }
    }

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2); 
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        //printing Q
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}