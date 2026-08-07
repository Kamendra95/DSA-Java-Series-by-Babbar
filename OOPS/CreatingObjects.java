package OOPS;

public class CreatingObjects {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default constructor (ctor) // attr. -> garbage
    public CreatingObjects(){
        System.out.println("Student Default ctor called");
    }

    // Parameterised ctor
    public CreatingObjects(int id, int age, String name, int nos){
        System.out.println("Student Parameterised ctor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy ctor
    public CreatingObjects(CreatingObjects srcobj){
        System.out.println("Student copy ctor called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // Methods / Behaviours
    public void study(){
        System.out.println(name + " Studing");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }


    
    public static void main(String[] args) {

        // Parametereised ctor
        CreatingObjects A = new CreatingObjects(1, 12, "Kamendra", 3);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        A.bunk();
        A.sleep();
        A.study();

        // Copy ctor
        CreatingObjects B = new CreatingObjects(A);
        System.out.println(B.name);
        System.out.println(B.age);
        System.out.println(B.id);
        System.out.println(B.nos);

        B.sleep();
    }

}
