package week7.Cafe;

public class Ordered implements State{
    private Cafe cafe;

    public Ordered(Cafe cafe) {
        this.cafe = cafe;
    }


    @Override
    public void Ordered() {
        System.out.println("주문해주셔서 감사합니다.");
        cafe.setState(new Making(cafe));
    }

    @Override
    public void Making() {
        System.out.println("주문 먼저 해주세요");
    }

    @Override
    public void Complete() {
        System.out.println("주문 먼저 해주세요");
    }

    @Override
    public String getState() {
        return "주문이 완료되었습니다.";
    }
}
