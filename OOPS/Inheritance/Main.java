package OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {

        // Car c = new Car("Thar", "800", 4, 5, "Auto");
        // c.startEngine();
        // c.startAC();
        // c.stopEngine();

        Motorcycle M = new Motorcycle("Splendor", "Xline", 2, "U", "Soft");
        M.startEngine();
        M.wheelie();
        M.stopEngine();
    }
}
