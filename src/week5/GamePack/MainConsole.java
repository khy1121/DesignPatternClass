package week5.GamePack;

public class MainConsole {
    public static void main(String[] args) {
        Console c = new Ps5("ps5");
        c.setPackStrategy(new SuperMarioPack());
        c.insert();   // 마리오 장착
        c.display();  // 마리오 화면

        c.setPackStrategy(new ZeldaPack()); // 실행 중 전략 교체
        c.insert();   // 젤다 장착
        c.display();  // 젤다 화면

        Console c2= new Nintendo("NINTENDO");
        c2.setPackStrategy(new SuperMarioPack());
        c2.insert();   // 마리오 장착
        c2.display();  // 마리오 화면

        c2.setPackStrategy(new ZeldaPack()); // 실행 중 전략 교체
        c2.insert();   // 젤다 장착
        c2.display();  // 젤다 화면
    }
}
