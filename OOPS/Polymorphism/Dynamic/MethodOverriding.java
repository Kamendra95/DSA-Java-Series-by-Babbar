package OOPS.Polymorphism.Dynamic;

public class MethodOverriding {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    
public static void main(String[] args) {
        MethodOverriding a;

        a = new Dog();  // upcasting
        a.sound(); // Output: Dog barks

        a = new Cat();  // upcasting
        a.sound(); // Output: Cat meows
    }
}


class Dog extends MethodOverriding {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends MethodOverriding {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


//     public static void main(String[] args) {
//         MethodOverriding a;

//         a = new Dog();  // upcasting
//         a.sound(); // Output: Dog barks

//         a = new Cat();  // upcasting
//         a.sound(); // Output: Cat meows
//     }
// }

