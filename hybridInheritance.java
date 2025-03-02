public class hybridInheritance{
    public static void main(String args[]){
        Fish f1 = new Fish();
        f1.tuna();
        Mammal h1 = new Mammal();
        h1.human();
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

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }

    void tuna(){
        System.out.println("tuna");
    }

    void shark(){
        System.out.println("shark");
    }
}

class Bird extends Animal{
    void bird(){
        System.out.println("bird");
    }

    void peacock(){
        System.out.println("peacock");
    }
}

class Mammal extends Animal{
    void mammal(){
        System.out.println("mammal");
    }

    void dog(){
        System.out.println("dog");
    }

    void cat(){
        System.out.println("cat");
    }

    void human(){
        System.out.println("human");
    }
}