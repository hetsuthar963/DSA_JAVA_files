import java.util.*;
public class taxcalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income<500000) {
            }
        else if (income <= 1000000 && income > 500000) {
            tax = (int)(income*0.2);
            income = income - tax;
            }
        else {
            tax = (int)(income*0.3);
            income = income - tax; 
        }
        { System.out.println("Income with tax: "+income);}
    } 
}