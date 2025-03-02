/*
FUNCTION OVERLOADING 
-Only depends on the number of parametres
-Does not depends on the return type 
*/ 

import java.util.*;
public class Overloading{
    // public static int sum(int a, int b){   //sum of 2 integer numbers
    //     return a + b;
    // }
    // public static int sum(int a, int b, int c){ // Sum of 3 integer numbers
    //     return a + b + c;
    // }

    public static int sum(int a, int b){          //sum of 2 integer numbers
        return a + b;  
    }
    public static float sum(float a, float b){    // sum of 2 float numbers
        return a + b; 
    }

    public static void main(String args[]){
        System.out.println(sum(2,3));
        System.out.println(sum(2.5f,3.4f));
    }
}