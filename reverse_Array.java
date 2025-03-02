import java.util.*;
public class reverse_Array{
    public static void reverseArray(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;

        while(first<last){
            //SWAP
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,5,6};
        reverseArray(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    System.out.println();
    }
}