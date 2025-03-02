//MAM'S CODE

import java.util.*;
public class pairs_In_Arrays{
    public static void arrayPairs(int numbers[]){
        int tp = 0;//initializing total possible pairs from '0'

        for(int i=0; i<numbers.length; i++){

            int curr = numbers[i]; // 2, 4, 6, 8, 10
            
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" +curr+ "," +numbers[j]+ ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total possible pairs : "+tp);
        
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        arrayPairs(numbers);
    }
}

//MINE (MODIFIED CODE FOR BETTER UNDERSTANDING)
/*
import java.util.*;
public class pairs_In_Arrays{
    public static void arrayPairs(int numbers[]){

        int tp = 0;//initializing total possible pairs from '0'
        
        for(int i=0; i<numbers.length; i++){
            int x = numbers[i]; //initilizaing 1st number of pair as 'x' (2,4,6,8)
            
            for(int j=i+1; j<numbers.length; j++){
                int y = numbers[j]; //initilizaing 2nd number of pair as 'y' (4,6,8,10)
                System.out.print("("+x+","+y+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total possible pairs : "+tp);
        
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        arrayPairs(numbers);
        

    }
}

*/




//TO CALCULATE THE PAIRS FOR ANY MATH PROBLEM LIKE IN MAXIMA & MINIMA OR NUMBER OF POSSIBILITY OF PAIRS..
//..USE THIS CODE:-
/*
import java.util.*;
public class pairs_In_Arrays{
    public static void arrayPairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int x = numbers[i]; // [2,4,6,8]
            for(int j=0; j<numbers.length; j++){
                int y = numbers.length[j]; [4,6,8,10]
                System.out.print("("+x+","+y+")");
            }
            System.out.println();
        }
        System.out.println("Total pairs:"+tp);
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        arrayPairs(numbers);

    }
}
*/