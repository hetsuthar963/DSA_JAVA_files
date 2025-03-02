import java.util.*;

public class opt_in_heap {

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // insertion/addition in heap
        public void add(int data) {
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; // x is child index
            int par = (x-1)/2; // par is parent index

            while(arr.get(x) < arr.get(par)) { // for maxheap change < to >   TC: O(log(n)) 
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Updating pointers
                x = par;
                par = (x-1)/2;
            }
        }

        // peeking in heap
        public int peek() { // O(1)
            return arr.get(0);
        }


        // making a heapify function [ O(log n) ]
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i; // chamge min to max for maxheap

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){ // for maxheap change > to <
                minIdx = left; // change min to max for maxheap
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){ // for maxheap change > to <
                minIdx = right; // change min to max for maxheap
            }

            if(minIdx != i){ 
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        // deletion/removing in heap
        public int remove() {
            int data = arr.get(0);

            //s-1 : swap first & last
            int temp = arr.get(0); 
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //s-2 : delete last
            arr.remove(arr.size()-1);

            //s-3 : calling heapify 
            heapify(0);
            return data;
        }  

        // to check if heap is empty or not
        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()) { // heap sort [ O(n log n)]
            System.out.println(h.peek());
            h.remove();
        }

        // here if we use h- [heap] / pq-[priority queues] 
        // it will work same as PRIORITY QUEUE
    }
}

