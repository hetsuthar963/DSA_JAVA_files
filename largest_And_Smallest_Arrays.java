import java.util.*;
public class largest_And_Smallest_Arrays{
    public static int largest(int numbers[]) {

        int largest = Integer.MIN_VALUE; //(-infinity)
        int smallest = Integer.MAX_VALUE; //(+infinity)
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
            
        }
        System.out.println("Smallest value is : "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,5,17,1,9};
        System.out.println("largest value is :" + largest(numbers));
    }
}