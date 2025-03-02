import java.util.ArrayList;
public class sizeArraylist{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //size of array
        System.out.println(list.size());

        //printing arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //printing reverse arraylist
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }
}