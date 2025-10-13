package week5.GamePack;

public class SuperMarioPack implements PackStrategy {
    //public void insert()  { System.out.println("Super Mario 팩을 장착합니다."); }
    //public void display() { System.out.println("마리오가 뛰고 달립니다!"); }

    public void changePack() {
        System.out.println("Super Mario 팩을 장착합니다.");
    }
    public void startGame() {
        System.out.println("마리오가 뛰고 달립니다!");
    }
}