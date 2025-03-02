public class OOPS_rev{
    public static void main(String args[]){//main class
        Pen p1 = new Pen();//here we have created a p1 named object
        p1.setColor("Blue");
        System.out.println("Pen is of "+p1.color+" color.");
        p1.setTip(6);
        System.out.println("Tip of pen is "+p1.tip+"mm.");
        p1.setType("Ink");
        System.out.println("Type of pen is "+p1.type+"-pen.");

    }    
}

class Pen{
    //these all are attributes(Properties) of "Pen -class"

    String color;
    int tip;
    String type;

    //now here we will define the functions for class "Pen" by using above attributes

    void setColor(String newColor){
        color = newColor;
    }    

    void setTip(int newTip){
        tip = newTip;
    }

    void setType(String newType){
        type = newType;
    }

}