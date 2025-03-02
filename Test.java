/*import java.util.*;
public class Test{
    public static void main(String args[]){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<0){
            System.out.println("Negative");
            }
        else{
            System.out.println("Positive");
        }
    }
}*/




/*public class Solution {
public static void main(String[] args) {
double temp = 103.5;
if(temp <= 100){
    System.out.println("Don't have fever");
    }
else{
    System.out.println("Have fever");
}
}
}*/



/*import java.util.*;
public class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number : ");
        int n = sc.nextInt();

        switch(n){
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wensday");
            break;
            case 4 : System.out.println("Thusday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturday");
            break;
            default:System.out.println("Incorrect");
            
        }
    }
}*/




//KEEP ENTERING NUMBERS TILL USER ENTERS A MULTIPLE OF 10
/*import java.util.*;
public class Test{
    public static void main(String args[]){
        do{
        System.out.print("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if(n % 10 == 0){
            continue;
            }   
            System.out.println("Non multiple of 10: "+n);
        }while(true);

    }
}
*/



//TO CHECK IF A NUMBER IS PRIME OR NOT

/*import java.util.*;
public class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2){
            System.out.println(n+" is a prime number");
            }
        else{
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){             // here n is a multiple of i (i is not equal to 1 or n)
                isPrime = false;
                }
            }
        
            if (isPrime == true){
                System.out.println(n+" is a prime number");
                }
            else{
                System.out.println(n+" is not a prime number");
            }
        }
    }
}
*/


//  Q-1
/*public class Test {
public static void main(String[] args){
for(int i=0; i<5; i++) {
System.out.println("Hello");
i+=2;
}
}
}*/

//Q-2
/*
import java.util.*;
public class Test{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int number;
int SumEven = 0;
int SumOdd = 0;
int choose;

do{
    System.out.println("Enter a number : ");
    number = sc.nextInt();
    
    if(number % 2 == 0 ){
        SumEven += number;
        }
    else{
        SumOdd += number;
        }
        System.out.println("To CONTINUE press - 1       To EXIT press - 0");
        choose = sc.nextInt();
    }   
    while(choose == 1);

    System.out.println("Sum of ODD numbers : "+SumOdd);
    System.out.println("Sum of EVEN numbers : "+SumEven);
    
}
}*/


//Q-3
/*
import java.util.*;
public class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int a = 1;
    
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        for (int i=1; i<= n;i++){
            a *= i;
        }System.out.println("Factorial is : "+a);
    }
} 
*/

//Q-4
/*
import java.util.*;
public class Test{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to get its multiplication table : ");
    int n = sc.nextInt();
    for(int i = 0; i <= 10; i++){
        System.out.println(n+"*"+i+"="+n*i);       
    }
}
}
*/

//Q-5
/*
public class Solution {
public static void main(String args[]) {
for(int i = 0; i <= 5; i++ ) {
System.out.println("i = " + i );
}

System.out.println("i after the loop = " + i );

}
}
*/

//SWAPING TWO VALUES:
/*
import java.util.*;
public class Test{
    public static void main(String args[]){
        int temp;
        int a = 2;
        int b = 3;
        System.out.println("value of a = "+ a+" & value of b ="+ b);


        temp = a;
        a = b;
        b = temp;

        System.out.println("swaped value of a = "+a+" & swaped value of b = "+b);
    }
}
*/



/*
//Summation of total elements in array
import java.util.*;
public class Test{
    public static void adding_Arrays(int numbers[]){
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
            sum = sum + numbers[i];
        }       
        System.out.println("= " + sum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        adding_Arrays(numbers);
    }
}
*/

/*
public class Test{
    public static void main(String args[]){
        System.out.print(Book.count+" ");
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        Book b3 = new Book(350);
        System.out.println(Book.count);
    }
}

class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}
*/
