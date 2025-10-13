package Practice.no1;

public class Atom extends Robot{

    public Atom(String name) {
        super(name);
    }

    public void move() {
        System.out.println("fly");
    }

    public void attack() {
        System.out.println("punch");
    }

}
