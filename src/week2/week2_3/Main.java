package week2.week2_3;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        Cart cart = new Cart();
        Song lovesong = new Song("Love Song", 10.0);
        lovesong.setDiscountOrNot(new NonDiscounted());
        Song sadsong = new Song("Sad Song", 10.0);
        sadsong.setDiscountOrNot(new TodayEvent());
        Song funnysong = new Song("Funny Song", 10.0);
        funnysong.setDiscountOrNot(new OnSale());

        cart.addSong(lovesong);
        cart.addSong(sadsong);
        cart.addSong(funnysong);
        cart.deleteSong(sadsong);

        cart.calculate();

    }
}