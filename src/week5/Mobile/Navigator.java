package week5.Mobile;

public abstract class Navigator {
    private final String location;
    private final String destination;
    private MovingStrategy ms;

    public Navigator(String location, String destination) {
        this.location = location;
        this.destination = destination;
        System.out.println(location +"으로 경로를 탐색합니다");
    }

    public void setMovingStrategy(MovingStrategy ms) {
        this.ms = ms;
    }

    public abstract void buildRoute();


}
