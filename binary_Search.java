import java.util.*;
public class binary_Search{
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            
            int mid = (start+end)/2;
            // comparisons
            if(numbers[mid] == key){  //when found 
                return mid;
            }
            if(numbers[mid] > key){  //when key is smaller than mid value
                end = mid-1;
            }
            else{                   //when key is greater than mid value
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,4,6,7,8,9};
        int key = 2;
        System.out.println("Your index value is :"+binarySearch(numbers, key));
    }    
}
