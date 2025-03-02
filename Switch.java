/*import java.util.*;
public class Switch{
    public static void main(String args[]){
        int num = 4;
        switch(num){
        case 1 : System.out.println("yellow");
            break;
        case 2 : System.out.println("red");
            break;
        case 3 : System.out.println("white");
            break;
        case 4 : System.out.println("Rainbow");
            break;
        default : System.out.println("BLACK");
    }
}
}
*/

import java.util.*;
public class Switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Enter a number : ");
        int b = sc.nextInt();
        System.out.println("Enter an operator : ");
        char operator = sc.next().charAt(0);
            switch(operator){
            case '+': System.out.println(a+b);
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;
            default : System.out.println("incorrect");
                
        }
    }

}
