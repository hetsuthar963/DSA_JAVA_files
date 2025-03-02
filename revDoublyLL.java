public class revDoublyLL{
    /*Reversing a doubly linkedlist */
    public void reverse(){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next; 
        }
        head = prev;
    }
    

    public static void main(String args[]){
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();
        dll.print();
    }
}