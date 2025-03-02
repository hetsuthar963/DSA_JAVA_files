//Find Product of a = 3 & b = 5 using function with parameters

import java.util.*;
public class multiplyF{
    public static int multiplyF(int a, int b){
        int Product = a*b;

        return Product;
    }

    public static void main(String args[]){
        int num1 = 3; 
        int num2 = 5;
        
        int Result = multiplyF(num1,num2);
        System.out.println("Your product is :" +Result);

        int s = multiplyF(9,2);
        System.out.println("Your product is :" +s);

    }
    
}