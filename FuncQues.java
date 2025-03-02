// (Q-1) Write a java method to compute the average of three numbers.

import java.util.*;
public class FuncQues{
/*
{
    public static int Average(int a,int b,int c){
    
        int Avg = a+b+c/3;
        return Avg;
    }

    public static void main(String args[]){
        
        int avg = Average(2,3,4);
        System.out.println("Average of 3 numbers :"+avg);    
    }
}
*/


/*
(Q-2) Write a method named isEven that accepts an int argument. The method should return 
true if the argument is even, or false otherwise. Also write a program to test your method.
*/
/*
{
    public static boolean isEven(int n){
        //int a = True;
        while(n > 0){
            if(n % 2 == 0){
                System.out.println("True");
            return true;
            } 
            System.out.println("False");
            break;
        }
        return false;         
    }

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean a = isEven(n);
    }
}
*/


/*(Q - 3)Write a Java program to check if a number is a palindrome in Java? 
( 121 is a palindrome, 321 is not)

[A number is called a palindrome if the number is equal to the reverse of a 
number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. 
On the other hand, 321 is not apalindrome because the reverse of 321 is 
123, which is not equal to 321.]
*/


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int rev = 0;
        while(n > 0){
            int lastdigit = n%10;
            rev = (rev * 10) + lastdigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}

