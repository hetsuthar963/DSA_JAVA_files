public class multilevelInheritance{
    public static void main(String args[]){
        Dog bobby = new Dog();
        bobby.eats();
        bobby.legs = 4;
        System.out.println(bobby.legs);
    }
}

class Animal{
    String color;

    void eats(){
        System.out.println("eats");
    }

    void breaths(){
        System.out.println("breaths");
    }

}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}
