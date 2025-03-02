import java.util.*;
public class Patterns{
    /*public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){         //outer loop

            for(int j=1; j<=totCols; j++){      //inner columns
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    //boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }*/


    /*public static void inverted_And_Rotated_Half_Pyramid(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");  //for printing spaces
            }  
               
            for(int j=1; j<=i; j++){
                System.out.print("*");   //for printing star
            }
            
            System.out.println();
        }
            
    }
    
    public static void main(String args[]){
    // hollow_rectangle(5,5);
      inverted_And_Rotated_Half_Pyramid(6);
    }
}*/

    /*public static void inverted_Half_Pyramid_WithNumbers(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_Half_Pyramid_WithNumbers(6);
    }
}*/

    /*public static void fliyds_Triangle(int n, int counter){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        fliyds_Triangle(4,1);
    }
}*/


  /*public static void zero_One_Triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        zero_One_Triangle(6);
    }*/

    /*
    public static void butterfly_Pattern(int n){
        for(int i=1; i<=n; i++){//1st HALF-OUTER LOOP

            for(int j=1; j<=i; j++){
                System.out.print("*");  //for 1st half-stars(i)
            }
            for(int j=1; j<=2*(n-i); j++){  //for 1st half-spaces[2*(n-1)]
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");  //for 1st half-stars(i)
            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){ //2nd HALF-OUTER LOOP

            for(int j=1; j<=i; j++){
                System.out.print("*");  //for 2st half-stars(i)
            }
            for(int j=1; j<=2*(n-i); j++){  //for 2st half-spaces[2*(n-1)]
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");  //for 2st half-stars(i)
            }
            System.out.println();
        }    
    }
    public static void main(String args[]){
        butterfly_Pattern(4);
    }
    */

    /*
    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){  //for SPACES
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){   //for STARS
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rhombus(5);
    }
    */

    /*
    public static void hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){ //SPACES
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){  //STARS position on hollow rhombus
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");   //SPACE position on hollow rhombus
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_Rhombus(5);
    }
    */


    public static void diamond(int n){
        //FIRST HALF
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){  //SPACES
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){  //STARS
                System.out.print("*");
            }
            System.out.println();
        }
        //SECOND HALF
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){  //SPACES
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){  //STARS
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamond(3);
    }
}




