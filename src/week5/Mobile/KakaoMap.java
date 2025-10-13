package week5.Mobile;

public class KakaoMap extends Navigator{
    MovingStrategy ms;
    public KakaoMap(String location, String destination) {
        super(location, destination);
    }



    @Override
    public void buildRoute() {
        ms.move();
    }
}
