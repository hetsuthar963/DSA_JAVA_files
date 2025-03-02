public class constructor_Chaining{
    public static void main(String args[]){
        Derived obj = new Derived("test1");
    }
}

// class Temp{//using [this()] keyword

//     Temp(){
//         this(5);
//         System.out.println("the default constructor");
//     }

//     Temp(int x){
//         this(15,5);
//         System.out.println(x);
//     }

//     Temp(int x, int y){
//         this(22,10,2);
//         System.out.println(x*y);
//     }

//     Temp(int x, int y, int z){
//         System.out.println(x+y+z);
//     }
// }

class Base{
    String name;

    Base(){
        this("");
        System.out.println("No-argument constructor of base class.");
    }

    Base(String name){
        this.name = name;
        System.out.println("Calling parameterized constructor of base.");
    }
}

class Derived extends Base{//using [super()] keyword
    Derived(){
        System.out.println("No-arguments of derived class.");
    }

    Derived(String name){
        super(name);
        System.out.println("Calling parameterized constructor of derived.");
    }
}