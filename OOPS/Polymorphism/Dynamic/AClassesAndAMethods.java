package OOPS.Polymorphism.Dynamic;

public class AClassesAndAMethods {

        public static void main(String[] args) {
            Shape s;

            s = new Circle();
            s.draw(); // Output: Drawing Circle

            s = new Rectangle();
            s.draw(); // Output: Drawing Rectangle
        }
    }

    abstract class Shape {
        abstract void draw(); // No body, child class must implement this

        void display() {
            System.out.println("This is a shape");
        }
    }

    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    // public class Main {
    //     public static void main(String[] args) {
    //         Shape s;

    //         s = new Circle();
    //         s.draw(); // Output: Drawing Circle

    //         s = new Rectangle();
    //         s.draw(); // Output: Drawing Rectangle
    //     }
    // }

