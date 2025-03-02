/*import java.util.*;
public class WhileLoops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i<=n){
            sum += i;
            i++;            
        }
        System.out.println("Sum is: "+sum);
    }
}*/




import java.util.*;
public class WhileLoops{
    public static void main(String args[]){
        int n = 10899;
        int rev = 0;

        while (n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10; 
        }
        System.out.println(rev);
    }
}