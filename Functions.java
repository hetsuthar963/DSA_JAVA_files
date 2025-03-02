import java.util.*;
public class Functions {
    public static int printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        return 4;
    }

//FUNCTIONS WITH PARAMETERS

    public static int calculateSum(int num1, int num2) { //Parameters or formal parameters
        int Sum = num1 + num2;

        return Sum;    
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int a = sc.nextInt();
        System.out.println("Enter second value : ");
        int b = sc.nextInt();

        int Sum = calculateSum(a,b); //this are called ARGUMENTS or Actual Parameters

        System.out.println("Your sum is :"+Sum);

         //function is called here
    }
}
