package bt.edu.goc;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object created");
    }

    // overwriting the method of Computer interface
    public void compile() {
        System.out.println("Compiling from Laptop class.");
    }

}
