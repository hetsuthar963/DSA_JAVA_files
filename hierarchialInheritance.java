import java.security.Permissions;

public class hierarchialInheritance{
    public static void main(String args[]){
        Mammal person = new Mammal();
        person.breaths();
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("Breaths");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flys");
    }
}