package week7.Cafe;

import java.util.Scanner;

public class Cafe {
    private State state;
    private String menu;
    public Cafe(){
        this.state = new Ordered(this);
    }

    public void setState(State state){
        this.state = state;
    }

    public void order(){
        System.out.println("메뉴를 입력해주세요 ");
        Scanner sc = new Scanner(System.in);
        menu = sc.nextLine();
        System.out.println( menu + "가 주문 되었습니다.");
        setState(new Ordered(this));
    }

    public void Ordered() {
        state.Ordered();
    }

    public void Making() {
        state.Making();
    }

    public void Complete() {
        state.Complete();
    }

    public String getState(){
        return state.getState();
    }
}
