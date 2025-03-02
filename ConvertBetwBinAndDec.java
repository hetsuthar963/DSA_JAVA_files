import java.util.*;
public class ConvertBetwBinAndDec{

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (int)(lastDigit * Math.pow(2,pow));
            pow ++;
            binNum = binNum/10;    
        }

        System.out.println("Decimal number of "+myNum+" is "+decNum);
    }

    public static void main(String args[]){
        binToDec(1011);
    }
}
