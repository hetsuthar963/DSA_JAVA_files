import java.util.*;
public class stringLength{
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        // String fullName = "Tony Stark is Ironman";
        // System.out.println(fullName.length());

        //Using CONCATENATION
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName +" "+ lastName;
        //System.out.println(fullName);

        printLetters(fullName);
    }
}