import java.util.ArrayList;
import java.util.Collections;
public class sortArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Original  :"+list);
        Collections.sort(list);
        System.out.println("Ascending sort  :"+list);//ascending 

        //for descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Desceding sort  :"+list);
    }
}