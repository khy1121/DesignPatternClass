package week5.GamePack;


public class ZeldaPack implements PackStrategy {
   // public void insert()  { System.out.println("Zelda의 전설 팩을 장착합니다."); }
   // public void display() { System.out.println("젤다의 전설: 하이랄 탐험 시작!"); }

    public void changePack() {
        System.out.println("Zelda의 전설 팩을 장착합니다.");
    }

    public void startGame() {
        System.out.println("젤다의 전설: 하이랄 탐험 시작!");
    }
}
