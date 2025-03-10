public class LinkedList{
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

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

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

    public void add(int idx, int data){
        //for adding into head condition
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new  Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode; 
    }

    public int removeFirst(){
        if(size == 0){//when linked list is empty
            System.out.println("Linked list is empty!!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){//when linked list has only one node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast(){
        if(size == 0){
            System.out.println("Linked list is empty!!");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //PREV : i = size-2;
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;   
        }
        
        int val = prev.next.data;//tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){//key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverselist(){//O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head = head.next;//remove first
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){//helper
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }
        return slow;//slow is my midnode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;//right half head
        Node left = head;
        
        //step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    /*public static void main(String args[]){
        LinkedList ll = new LinkedList();
        //ll.print();
        //ll.addFirst(2);
        //ll.print();
        //ll.addFirst(1);
        //ll.print();
        //ll.addLast(4);
        //ll.print();
        //ll.addLast(5);
        //ll.add(2, 3);
        //ll.print();
        //System.out.println(ll.size);
        //ll.removeFirst();
        //ll.print();
        //ll.removelast();
        //ll.print();
        //System.out.print(ll.size);
        //System.out.println(ll.recSearch(3));
        //System.out.println(ll.recSearch(10));
        // ll.reverse();
        //ll.print();
        //ll.deleteNthfromEnd(3);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }*/

    /*ZIG-ZAG*/
/*
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        //alt merge - zig-zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //5->4->3->2->1

        ll.print();
        ll.zigZag();
        ll.print();
    }
*/

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