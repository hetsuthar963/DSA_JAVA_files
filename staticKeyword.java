public class staticKeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolName = "B.H.S";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";
    }
}

class Student{

    static int returnPercentage(int math, int phy, int chem){//here this method is static for all the classes
        return(math + phy + chem)/3;
    }

    String name;
    int rollno;
    static String schoolName;

    void setName(String name){//setter
        this.name = name;
    }

    String getName(){//getter
        return this.name;
    }

}