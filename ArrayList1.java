import java.util.ArrayList;
public class ArrayList1{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        //ADD operation : t/c :-  O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //add at index
        list.add(1, 8);

        System.out.println(list);
        // //GET operation : t/c :-  O(1)
        // int element = list.get(2); 
        // System.out.println(element);

        // //Delete : t/c :-  O(n) 
        // list.remove(2);
        // System.out.println(list);

        // //Set: t/c :-  O(n)
        // list.set(3,10);
        // System.out.println(list);

        // //contains : t/c :-  O(n)
        // System.out.println(list.contains(3));
        // System.out.println(list.contains(9));
        
    }
}