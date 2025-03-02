import java.util.*;
public class checkbit_even_or_odd{
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String args[]){
        oddorEven(3);
        oddorEven(11);
        oddorEven(14);
    }
}