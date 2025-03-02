import java.util.*;
public class arrays_As_Function_Arguments{
    public static void update(int marks[]){
        int unchangable =10;
        
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {92,93,94};
        int unchangable = 5;
        System.out.println(unchangable);
        update(marks);

        //printing our marks using loop to make our code efficient & avoiding over writting
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println();
    }
}