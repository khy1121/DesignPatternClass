package week7.Cafe;

public class Making implements State{

    private Cafe cafe;

    public Making(Cafe cafe) {
        this.cafe = cafe;
    }
    @Override
    public void Ordered() {
        System.out.println("이미 주문이 완료되었습니다.");
    }

    @Override
    public void Making() {
        System.out.println("주문하신 음료 준비하는 중입니다.");
        cafe.setState(new Complete(cafe));
    }

    @Override
    public void Complete() {
        System.out.println("조금만 기다려주세요 주문하신 음료 제조중입니다.");
    }

    @Override
    public String getState() {
        return "음료 제조중입니다.";
    }
}
