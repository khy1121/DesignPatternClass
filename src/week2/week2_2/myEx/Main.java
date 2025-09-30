package week2.week2_2.myEx;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setRole(new Driver());
        p.getRole();
        p.setRole(new Worker());
        p.getRole();

    }
}
