package week5.GamePack;

public class Ps5 extends Console {


    public Ps5(String manufacturer) {
        super(manufacturer);
        System.out.println( manufacturer +  "에 오신 걸 환영합니다! ");
    }

    @Override
    public void display() {
        if (ps==null) throw new IllegalStateException("게임팩 없음");
        ps.startGame();
    }
}
