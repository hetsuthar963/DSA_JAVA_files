//REVISION : Recursion

//Printing numbers in decreasing order using recursion:
/*
public class Revision{
    public static void print_dec_num(int n){
        if(n == 1){                  //BASE CASE
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        print_dec_num(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        print_dec_num(n);
    }
}
*/

//Printing numbers in increasing order using recursion:

public class Revision{
    public static void print_inc_num(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        
        print_inc_num(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[]){
        int n = 5;
        print_inc_num(n);
    }
}
