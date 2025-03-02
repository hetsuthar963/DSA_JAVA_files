/*   //Printing Subarrays
import java.util.*;
public class subArrays{
    public static void sub_Arrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");

                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays =" +ts);
    }
    public static void main(String [] args){
        int numbers[] = {2, 4, 6, 8, 10};
        sub_Arrays(numbers);
    }
}
*/


// Maximum sum of subarrays(BRUTE FORCE method)
/*
import java.util.*;
public class subArrays{
    public static void maxSubarraysSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    //printing subarrays sum
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum =" +maxSum);
    }
    public static void main(String[]args){
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraysSum(numbers);
    }
}
*/


//PREFIX method
/*
import java.util.*;
public class subArrays{
    public static void max_SubArrays_Sum2_PrefixSum(int numbers[]){    
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }                
            }                    
        }
        System.out.println("max sum is = "+maxSum);
        
    }
    public static void main(String args[]){
        int numbers[] = {1, -2, 6, -1, 3};
        max_SubArrays_Sum2_PrefixSum(numbers);
    }
}
*/

//KADANS ALGORITHM method 
/*
import java.util.*;
public class subArrays{
    public static void max_SubArrays_Sum3_KadanesAlgorithm(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray is: "+ms);
    }
    public static void main(String args[]){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        max_SubArrays_Sum3_KadanesAlgorithm(numbers);
    }
}
*/


//H.W [kadans algo only for all NEGATIVE NUMBERS]
/*
import java.util.*;
public class subArrays{
    public static void kadanes_ALLnegative(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            for(int j=cs; j<0; j++){
                if(cs<ms){
                    cs = numbers[i];
                }
            }
            ms = Math.max(cs,ms);   
        }
        System.out.print("maximum subArray sum is :"+ms);            
    }
    public static void main(String args[]){
        int numbers[] = {-1, -2, -3, -4};
        kadanes_ALLnegative(numbers);
    }
}
*/


/*H.W
Print the maximum and minimum sum of all your subarrays.

eg:-
(2,4)= 2+4 = 6
(2,4,6)= 2+4+6 = 12
*/


/*
import java.util.*;
public class subArrays{
    
    public static void sub_Arrays(int numbers[]){
        int max = 0;
        int tsArr = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;

            for(int j=i+1; j<numbers.length; j++){
                int end = j;
                int sum = 0;

                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                    max++;
                }
                tsArr++;
                System.out.println("="+sum);
                
            }
            System.out.println();
            
        }
        System.out.println("Total subarrays are: "+tsArr);
        System.out.println("Max sum is :"+max);
        
    }

    public static void main(String []args){
        int numbers[] = {2,4,6,8,10};
        sub_Arrays(numbers);
    }
}
*/








