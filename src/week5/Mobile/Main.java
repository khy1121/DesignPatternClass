package week5.Mobile;

public class Main {
    public static void main(String[] args) {


        KakaoMap gf = new KakaoMap("서울역", "30km");
        gf.setMovingStrategy(new Metro());

    }
}
