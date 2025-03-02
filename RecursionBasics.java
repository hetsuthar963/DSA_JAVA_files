public class RecursionBasics{
    //Printing numbers in decresing order
    public static void printDec_num(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec_num(n-1);
    }

    //Printing numbers in increasing order
    public static void printInc_num(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printInc_num(n-1);
        System.out.print(n+" ");
    }

    //Printing factorial of a number
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }

    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n+snm1;
        return sn;
    }

    //calculating nth term in fibonacci
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        //assuming that it will calculate smaller calculations by recursion
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //checking if array is sorted in ascending order or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        
        return isSorted(arr, i+1); 
    }

    //findind the first occurence element in array
    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccur(arr, key, i+1);
    }

    //finding the last occurence of the same number
    public static int lastOccurence(int arr[] , int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
    
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }

    //power of function
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;

        return x * power(x, n-1);
    }

    //optimized power function of O(n)
    /*
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        //n is odd
        if(n%2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
*/
    //optimized power function of O(log n)
    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;//square of halfpower

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    //Tiling problem
    public static int tilingProblem(int n){//for floor size 2 x n
        if(n == 0 || n == 1){//for base case
            return 1;
        }
        //work
        //vertical choice
        int fnm1 = tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
    }

    public static void main(String args[]){
        //int n = 25;
        //printDec_num(n);
        //printInc_num(n);
        //System.out.println(fact(n));
        //System.out.println(sum(n));
        //System.out.println(fib(23));
        // int arr[] = {8,2,3,5};
        // System.out.println(isSorted(arr,0));
        // int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        // System.out.println(lastOccurence(arr, 5, 0));
        // int a = 2;
        // int n = 5;
        // System.out.println(optimizedPower(a,n));
        System.out.println(tilingProblem(4));       
    }
}