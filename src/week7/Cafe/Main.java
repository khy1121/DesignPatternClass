package week7.Cafe;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        cafe.Complete();
        cafe.Making();
        cafe.order("카푸치노");
        cafe.Ordered();
        cafe.Making();
        cafe.Complete();
        System.out.println();

        cafe.Ordered();
        cafe.order("아메리카노");
        cafe.Ordered();
        cafe.Making();
        cafe.Complete();


    }
}
