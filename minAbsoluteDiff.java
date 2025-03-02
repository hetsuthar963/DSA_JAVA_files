import java.util.*;

public class minAbsoluteDiff{
    public static void main(String args[]){
        int A[] = {4, 1, 8, 7};
        int B[] = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i]-B[i]);//math function to calculate absolute difference
        }
        System.out.println("Min absolute difference of pairs = "+ minDiff);
    }
}