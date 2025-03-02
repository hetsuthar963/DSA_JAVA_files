public class DoubleLL{
     public static class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

     public void print(){
        //if below conditional statement not used then it will print
        //NULL for empty Linked list
        if(head == null){
            System.out.println("Linked list is empty!!");
            return;
        }
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

     public void addFirst(int data){
        //step 1 = create new node
        Node newNode = new Node(data); 
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 -newNode next = head
        newNode.next = head;//Link

        //step 3 -head = newNode;
        head = newNode;  
    }


    /*Reversing a doubly linkedlist */
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

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
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();
        dll.print();
    }
}