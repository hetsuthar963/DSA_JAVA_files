//Q-1
//(Approach-1):-[BRUTE FORCE]
/*
import java.util.*;
public class arrayAssignment{
    public static boolean repeat(int numbs[]){
        for(int i=0; i<numbs.length; i++){
            for(int j=i+1; j<numbs.length; j++){
                if(numbs[i]==numbs[j]){
                    System.out.println("True");
                    return true;
                }   
            }   
        }
        System.out.print("False");
        return false;   
    }

    public static void main(String []args){
        int numbs[] = {1,3,4,5,1};
        repeat(numbs);
    }
}
*/

/*
//(Approach-2)
import java.util.*;
public class arrayAssignment{
    public static boolean repeat(int numbs[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbs.length; i++){
            if(set.contains(numbs[i])){
            System.out.println("True");
            return true;
            }
            else{
                set.add(numbs[i]);
            }
        }
        System.out.print("False");
        return false;
    }
    public static void main(String[] args){
        int numbs[] = {1,2,3,4,1};
        repeat(numbs);
    }
}
*/





//Q-2
//lots of doubts!!!!!!!<*:__*:>
import java.util.*;
public class arrayAssignment{ 
    public static int search(int numbs[],int target){
        //min will have index of minimum element of numbs
        int min = minSearch(numbs);
        //find in sorted left
        if(numbs[min]<=target && target<=numbs[numbs.length-1]){
            return search(numbs,min,numbs.length-1,target);
        }
        //find in sorted right
        else{
            return search(numbs,0,min,target);
        }
    }
    //binary search to find target in left to right boundary
    public static int search(int numbs[],int left,int right,int target){
        int l=left;
        int r=right;
        //System.out.println(left+" "+right);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(numbs[mid] == target){
                return mid;
            }
            else if(numbs[mid] > target){
                r = mid-1;
            }
            else{
                r = mid+1;
            }
        }
        return -1;
    }
//smallest element index
public static int minSearch(int numbs[]){
    int left = 0;
    int right = numbs.length-1;
    while(left<right){
        int mid = left + (left-right)/2;
        if(mid > 0 && numbs[mid-1]>numbs[mid]){
            return mid;
        }
        else if(numbs[left] <= numbs[mid] && numbs[mid] > numbs[right]){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
    }
    return left;
}

    public static void main(String []args){
        int numbs[] = {1};
        int target = 0;
    }
}

