public class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        // Fish shark = new Fish();
        // shark.swim();
        // Animal lion = new Animal();
        // lion.eat();
    }
}

//Base(Parent) class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breaths");
    }
}
/*
Here extends function is used for creating a child 
class out of parent class. 
Similarly, FISH class is extended by ANIMAL class 
by inheritaring ANIMAL class properties in FISH 
class.
*/

//Derived/subclass(Child) class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}