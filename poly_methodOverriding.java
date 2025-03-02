public class poly_methodOverriding{
    public static void main(String args[]){
        Deer d1 = new Deer();
        d1.eats();
    }
}

class Animal{
    void eats(){
        System.out.println("Eats anything");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("Eats grass");
    }
}