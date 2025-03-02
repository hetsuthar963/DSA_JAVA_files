import java.util.*;
public class bit_Hw{
    public static void main(String args[]){
        int x = 3, y = 4;
        System.out.println("Before swaping x:"+x+" & y:"+y);
        //SWAPING using XOR

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After swaping x:"+x+" & y:"+y);
    }
}