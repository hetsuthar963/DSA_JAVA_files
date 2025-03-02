public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student();
        //System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;

    // Student(String name){
    //     this.name = name;
    // }
    Student(){
        System.out.println("Constructor is called/..");
    }
}