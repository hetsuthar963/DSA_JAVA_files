/*import java.util.*;
public class Nestedloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++){
            for(int star = 1; star <= (n - line + 1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/


/*import java.util.*;
public class Nestedloop{
    public static void main(String args[]){
        int n = 4;
        
        for(int line = 1; line <= n; line++){
            for(int number = 1; number <= line; number++){
                System.out.print(number);   
            }
            System.out.println();
        }
    }
}*/



import java.util.*;
public class Nestedloop{
    public static void main(String args[]){
        int n = 4;
        char ch = 'h';

        for(int line = 1; line <= n; line++){
            for(int chars = 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}