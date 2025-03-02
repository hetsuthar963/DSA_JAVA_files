//SWAP NUMBER FUNCTION [call by value]
import java.util.*;
public class SwapF{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("This is a :" +a);
        System.out.println("This is b :" +b);                                                                                                                                                                   
    }
    public static void main(String args[]){
        int a = 5;  
        int b = 10;
        swap(a,b);        //swap - value exchange
        
    }
}