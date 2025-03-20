package bt.edu.goc;

public class Desktop implements Computer {
    // this is a constructor
    public Desktop() {
        System.out.println("Desktop object created.");
    }

    // this method is from Computer interface
    public void compile() {
        System.out.println("Compiling from Desktop class.");
    }

}
