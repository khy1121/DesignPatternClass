package week5.GamePack;



public class Nintendo extends Console {


    public Nintendo(String manufacturer) {
        super(manufacturer);
        System.out.println( "닌텐도 에 오신 걸 환영합니다! ");
    }

    @Override
    public void display() {
        var p = ps;
        if (p==null) throw new IllegalStateException("게임팩 없음");
        p.startGame();
    }
}
