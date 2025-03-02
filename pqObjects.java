import java.util.PriorityQueue;
import java.util.Comparator;

public class pqObjects {
    static class Student implements Comparable<Student> { // Overriding (comparable -> use to compare values)
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override //syntax to compare the class of object 
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    
    public static void main(String args[]) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        //In reverse order 
        //PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("Arun", 4));// O(logn)
        pq.add(new Student("Bishop", 5));
        pq.add(new Student("Chimes", 2));
        pq.add(new Student("Dhales", 12));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+" -> "+ pq.peek().rank);// O(1)
            pq.remove();// O(logn)
        }
    }
}