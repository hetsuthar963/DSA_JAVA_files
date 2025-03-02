public class typesConstructors{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Shradha";
        s1.roll = 22;
        s1.password = "abcd";
        // Student s2 = new Student("Shradha");
        // Student s3 = new Student(123);
        Student s2 = new Student(s1);
        s2.password = "xyz"; 
    }
}

class Student {
    String name;
    int roll;
    String password;

    Student(Student s1){// COPY CONSTRUCTOR
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student(){
        System.out.println("Constructor ...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}