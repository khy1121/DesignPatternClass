package Practice.no1;

public class Main {
    public static void main(String[] args) {
        Robot atom = new Atom("아톰");
        Robot tv = new TaekwonV("태권브이");

        System.out.println("my name is " + atom.getName());
        atom.move();
        atom.attack();

        System.out.println("my name is " + tv.getName());
        tv.move();
        tv.attack();

    }
}
