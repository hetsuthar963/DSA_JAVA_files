import java.util.*;
public class trappedRainwater{
    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate leftmax boundary - array                  
        int leftmax[] = new int [n];                              
        leftmax[0] = height[0];                                   
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);//here, i-1 is for moving left in array every single time
        } 
        //calculate rightmax boundary - array
        int rightmax[] = new int [n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);//Similarly, i+1 is for movint right in array every single time 
        }
        int trappedwater = 0;
        
        //loop
        for(int i=0; i<n; i++){
            //waterlevel = min(leftmax boundary, rightmax boundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            //trappedrainwater = waterlevel - height
            trappedwater += waterlevel - height[i];//for i=0, =(4-4) = 0
                                                   //for i=1, =(4-2) = 2
                                                   //for i=2, =(4-0) = 4
                                                   //for i=3, =(5-6) = -1 = 0
                                                   //for i=4, =(5-3) = 2
                                                   //for i=5; =(5-2) = 3
                                                   //for i=6; =(5-5) = 0

                                                   //than adding all we get 11 as output
        }
        return trappedwater;
    }
    public static void main(String[] args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));

    }
}