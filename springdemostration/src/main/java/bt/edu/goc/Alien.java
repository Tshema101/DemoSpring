package bt.edu.goc;

public class Alien {
    private int age;

    // Alien class depend on laptop class/ object
    // private Laptop lap;
    // filed of Computer interface
    private Computer comp;

    private int salary;

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    // public void setAge(int age) {
    // System.out.println("Set Alien Called");
    // this.age = age;

    // }

    // public Alien(int age, Computer comp, int salary) {
    // System.out.println("Alien Object created");
    // this.age = age;
    // // this.lap = lap;
    // this.comp = comp;
    // // this.desk = desk;
    // this.salary = salary;
    // }

    public Alien() {
        System.out.println("Alien Object created");
    }

    public void code() {
        System.out.println("I am coding");
        // method of Laptop class
        // lap.compile();
        comp.compile();
        // desk.compile();
    }

    // public Laptop getLap() {
    // return lap;
    // }

    // public void setLap(Laptop lap) {
    // this.lap = lap;
    // }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
