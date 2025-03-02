/*
FACTORIAL OF A NUMBER N=4

FACTORIAL ONLY EXIST ON POSITIVE SIDE
WE CANNOT FIND FACTORIALS ON NEGATIVE NUMBERS
*/

import java.util.*;
public class factorial{
    public static int Factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f; //factorial of n
    }

    public static void main(String args[]){
        System.out.println(Factorial(9));
    }    
}

