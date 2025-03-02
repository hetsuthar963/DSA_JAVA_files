import java.util.*;
public class counting_Sort{
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //SORTing
        int j=0;
        for(int i=0; i<arr.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}