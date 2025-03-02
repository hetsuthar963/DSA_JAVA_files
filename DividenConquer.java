/*

//MERGE SORT

public class DividenConquer{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void mergSort(int arr[], int si, int ei){
        //BASE CASE
        if(si >= ei){
            return;
        }
        //work
        int mid = si + (ei-si)/2;//formula to find middle value of index
        mergSort(arr, si, mid);//left side
        mergSort(arr, mid+1, ei);//right side
        mergSort(arr, si, mid, ei);
    }

    public static void mergSort(int arr[], int si, int mid, int ei){
        //left(0,3)=4 & right(4,6)=3 == 4+3 = (7 size)
        int temp[] = new int[ei-si+1];
        int i = si;//iteration of left side
        int j = mid+1;//iterationn on right side
        int k = 0;//iteration for temporary array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for left side
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for right side 
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8,1};
        //printArr(arr);
        mergSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
*/


/*
//QUICK SORT

public class DividenConquer{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        //last element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);//left side
        quickSort(arr, pIdx+1, ei);//right side
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;//to create a space for smaller elements then pivot

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //pivot = arr[i]
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5, 1};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
*/




//SORTED & ROTATED ARRAY

public class DividenConquer{

    public static int search(int arr[], int tar, int si, int ei){
        //BASE CASE
        if(si > ei){
            return -1;
        }
        //work
        int mid = si+(ei-si)/2;

        //CASE found
        if(arr[mid] == tar){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case-a : Left 
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //case-b : Right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            //case-c : Right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //case-d : Left
            else{
                return search(arr, tar, si, mid-1);
            }

        }

    }

    public static void main(String args[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.print(tarIdx);
    }   
}