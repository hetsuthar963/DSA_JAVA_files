public class OOPS{
    public static void main(String args[]){
        Pen p1 = new Pen();//created  a pen object called P1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
        

        Student s1 = new Student();
        s1.setName("Tony Stark");
        System.out.println(s1.name);
        s1.setAge(19);
        System.out.println(s1.age);
        s1.calcPercentage(65,67,78);
        System.out.println(s1.percentage);    
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;//or CGPA

    void setName(String newName){
        name = newName;
    }

    void setAge(int newAge){
        age = newAge;
    }

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math) / 3;
    }
}