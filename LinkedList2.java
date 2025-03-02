public class LinkedList2{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }  
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow == fast){
                return true;
            }
        }
        return false;//cycle doesn't exists   
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast  = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){ 
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;
    } 

    public static void print(){
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


    /*public static void main(String args[]){
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2
        System.out.println("Yes, cycle exists\n"+isCycle());
        removeCycle();
        System.out.println("Cycle Removed\n"+isCycle());
    }*/

    //error in below code!!!!! 
    // private Node getMid(Node head){
    //     Node slow = head;
    //     Node fast = head.next;

    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;//mid Node
    // }

    // private Node merge(Node head1, Node head2){
    //     Node mergedLL = new Node(-1);
    //     Node temp = mergedLL;

    //     while(head1 != null && head2 != null){
    //         if(head1.data <= head2.data){
    //             temp.next = head1;
    //             head1 = head1.next;
    //             temp = temp.next;
    //         }else{
    //             temp.next = head2;
    //             head2 = head2.next;
    //             temp = temp.next;
    //         }
    //     }

    //     while(head1 != null){
    //         temp.next = head1;
    //         head1 = head1.next;
    //         temp = temp.next;
    //     }

    //     while(head2 != null){
    //         temp.next = head2;
    //         head2 = head2.next;
    //         temp = temp.next;
    //     }

    //     return mergedLL.next;
    // }

    // public Node mergeSort(Node head){
    //     if(head == null || head.next == null){
    //         return head;
    //     }

    //     //find mid
    //     Node mid = getMid(head);
    //     //left & right merge sort
    //     Node rightHead = mid.next;
    //     mid.next = null;
    //     Node newLeft = mergeSort(head);
    //     Node newRight = mergeSort(rightHead);
    //     //merge
    //     return merge(newLeft, newRight);
    // }
    
    // public static void main(String args[]){
    //     LinkedList ll = new LinkedList();
    //     ll.addFirst(1);
    //     ll.addFirst(2);
    //     ll.addFirst(3);
    //     ll.addFirst(4);
    //     ll.addFirst(5);
    //     //5->4->3->2->1

    //     ll.print();
    //     ll.head = ll.mergeSort(ll.head);
    //     ll.print();
    // }


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