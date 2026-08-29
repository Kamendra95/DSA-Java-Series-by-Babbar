package OOPS.Polymorphism.Static;

public class MethodOverloading {
    int add(int a, int b){
        return a + b;
    }

    // Overloading add
    int add(int a, int b, int c){
        return a + b + c;
    }

    double add(int a, int b, int c, double d){
        return a + b + c + d;
    }


    public static void main(String[]args){
        MethodOverloading M = new MethodOverloading();
        System.out.println(M.add(2, 3));
        System.out.println(M.add(4, 5, 6));
        System.out.println(M.add(2, 4, 6, 8.9));
    }
}
