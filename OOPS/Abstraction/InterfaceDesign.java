package OOPS.Abstraction;

interface Bird {
    void fly();
    void eat();
}

class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}

class Crow implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");
    }
}

public class InterfaceDesign {
    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird crow = new Crow();

        doBirdStuff(sparrow);
        doBirdStuff(crow);
    }
}
