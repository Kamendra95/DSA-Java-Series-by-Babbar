package OOPS.Inheritance;

public class Vehical {
    public String name;
    public String model;
    public int noOfTyres;

Vehical(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehical(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.printf("Engine is starting of %s : %s\n", name, model);
    }

    void stopEngine(){
        System.out.printf("Engine is Stoping of %s : %s\n", name, model);
    }
}
