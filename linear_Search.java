import java.util.*;
public class linear_Search{
    public static int linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,5,6,10,12,14,17,19};
        //ALSO TRY USING STRING LIKE
        // String menu[] = {"dosa","dal chaval","roti","pav bhaji","pani puri"};
        int key = 19;

        int index = linearsearch(numbers, key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("Your index number is = "+index);
        }
    }
}