import java.util.*;
public class Strings {
    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String ("xyz");
        //strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next();//(.next) is only used till a space comes
        name = sc.nextLine();//(.nextLine) spaces can used
        System.out.println(name);
    }
}