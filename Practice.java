/* 
//matrix
import java.util.*;
public class Practice{
    public static void main(String args[]){
        int matrix[][] = new int[4][4];
        int n = matrix.length, m = matrix[0].length;
        
    }
}
*/

//STRINGS
/*  different SYNTAX of strings and how to print it
import java.util.*;
public class Practice{
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str ="absns";
        String str2 = new String("xyza");
        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);
    }
}
*/
//Using the [.next() & .nextLine()] function
/*
import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        String a = "Tony stark";
        //name = sc.next();
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(a.length());//String length function
    }
}
*/
//Concatenation
/*
import java.util.*;
public class Practice{
    public static void main(String args[]){
        String fn = "Het";
        String ln = "Suthar";
        String name = fn+" "+ln;
        System.out.println(name);
        System.out.println(name.charAt(2));//Using [.charAt()] function
    }
}
*/
//Using loop printing a String
/*
import java.util.*;
 public class Practice{
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+"");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String fn = "Het";
        String ln = "Suthar";
        String name = fn+" "+ln;

        printLetters(name);
    }
}
*/
//(Q-1) Check if a string is a Palindrome?
/*
import java.util.*;
public class Practice{
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //is not palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "noon";
        System.out.println(isPalindrome(str));
    }
}
*/

