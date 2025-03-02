//H.W Sorting Assignment!!!
import java.util.*;
public class sortingAssignment{
    //bubble sorting
    public static void s_bubble(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    //selection sorting
    public static void s_selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos]<arr[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    //insertion sorting
    public static void s_insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
        int curr = arr[i];
        int prev = i-1;
        //finding correct place to insert
        while(prev >= 0 && arr[prev] < curr){
            arr[prev+1] = arr[prev];
            prev--;
        } 
        //insertion
        arr[prev+1] = curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String []args){
        int arr[] = {3,6,2,1,8,7,4,5,3,2,1};        
        //s_bubble(arr);
        //s_selection(arr);
        s_insertion(arr);
        printarr(arr);
    }
}
