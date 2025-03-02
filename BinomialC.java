/* BIONOMIAL FACTORIAL

nCr = n!/r!(n-r)!

*/

import java.util.*;
public class BinomialC{
    public static int Factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f; //factorial of n
    }

    public static int BioCof(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n-r);

        int BioCof = fact_n / (fact_r * fact_nmr);
        return BioCof;
    }

    public static void main(String args[]){
        System.out.println(BioCof(6,2));
    }    
}

