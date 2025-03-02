/*
import java.util.Collections;
public class insertion_Sort{
    public static void insertionSort(Integer arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            //finding out the correct position to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {5, 4, 1, 3, 2};
        //insertionSort(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
*/




import java.util.*;
public class insertion_Sort{
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);  
    }
}


//USING INBUILT SORTING FUNCTIONS:

//for asecnding order 
/*
import java.util.Arrays;
Arrays.sort(arr)
Arrays.sort(arr,si,ei)          //here [si] is starting index & [ei] is ending index
*/ 

//for descending order
/*
import java.util.Collections;
Arrays.sort(arr, Collections.reverseOrder())
Arrays.sort(arr, si, ei, Collections.reverseOrder())
*/