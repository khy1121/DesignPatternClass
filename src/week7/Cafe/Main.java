package week7.Cafe;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        cafe.Complete();
        cafe.Making();

        cafe.order();
        cafe.Ordered();
        cafe.Making();
        cafe.Complete();

        System.out.println();

        cafe.order();
        cafe.Ordered();
        cafe.Making();
        cafe.Complete();


    }
}
