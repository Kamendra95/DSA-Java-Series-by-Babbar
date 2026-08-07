package OOPS;

public class Encapsulation {

    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        // Extra layer of authentication.
        if (age < 100)
            this.age = a;
        return;
    }

    // public String getString() {
    // return this.gf;
    // }

    // Parameterised ctor
    public Encapsulation(int id, int age, String name, int nos, String gf) {
        System.out.println("Student Parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    public static void main(String[] args) {

        // Parametereised ctor
        Encapsulation A = new Encapsulation(1, 12, "Kamendra", 3, "Tina");
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);
        // System.out.println(A.nos);

        System.out.println(A.getAge());

        // System.out.println(A.getString());

        A.setAge(67);

        System.out.println(A.getAge());
    }
}
