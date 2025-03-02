import java.util.*;
public class ith_Bit{
    public static int getIthBit(int n, int i){//GET ith bit
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0 ;
        } 
        else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){//SET ith bit
        int bitMask = 1<<i;
        return n | bitMask;
    }

    
    public static int clearIthBit(int n, int i){//CLEAR ith bit
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){//UPDATE ith bit
        if(newBit == 0){
          return clearIthBit(n,i);
        }
        else{
          return setIthBit(n,i);
        }

        // n = clearIthBit(n,i);//UPDATE BIT
        // int bitMask = newBit << i;
        // return n|bitMask;
    }

    public static int clearIBit(int n, int i){//CLEAR Last ith bit
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsinRange(int i, int n, int j){//CLEAR range of bits
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){//Check if it is power of (2)two or not
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){//Counting SetBit 
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){//checking our LSB
                count ++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){//Fast Exponentional 
        int ans = 1;

        while(n>0){
            if((n & 1) != 0){ // checking LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static int modExpo(int a, int n, int x){//Modular Exponentional
        int ans = 1;
        while(n>0){
            if((n&1) != 0)//checking LSB
            ans = ans * a;    
            n = n>>1;
            a = a*a;
        }
        return ans%x;
    }
    public static void main(String args[]){
        System.out.println(modExpo(2,3,5));
    }
}   