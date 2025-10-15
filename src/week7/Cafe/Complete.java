package week7.Cafe;

public class Complete implements State{
    private Cafe cafe;

    public Complete(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void Ordered() {
        System.out.println("이미 제조 중입니다.");
    }

    @Override
    public void Making() {
        System.out.println("이미 음료가 완성되었습니다.");
    }

    @Override
    public void Complete() {
        System.out.println("주문하신 음료 나왔습니다");
    }

    public String getState(){
        return "음료가 완성되었습니다.";
    }
}
