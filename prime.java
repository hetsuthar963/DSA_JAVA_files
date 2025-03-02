//Check if a number is prime or not using function

import java.util.*;
public class prime{

    /*public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++){
            if(n % i == 0){      //dividing completely
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        System.out.println(isPrime(11));
    }
}
*/

//MORE EFFICIENT CODE

    public static boolean isPrime(int n){
        //corner case 
        //for 2

        if(n == 2){
            return true;
        }

        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
        }  

    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){        //calling isPrime at true
                System.out.print(i+" ");
            }
        }
        System.out.println();
    } 
    public static void main(String args[]){
        primesInRange(100);
    }
}

