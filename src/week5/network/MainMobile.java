package week5.network;

public class MainMobile {
    public static void main(String[] args) {
        Samsung phone = new Samsung("SAMSUNG", "010-1234-5678");

        phone.setOnlineStrategy(new WIFI()); // 기본 Wi-Fi
        phone.connect();

        phone.setOnlineStrategy(new LTE());  // 상황 변화 → LTE 전환
        phone.connect();

        phone.call("010-1111-1111");
        phone.ring("010-9999-9999");
        System.out.println();
        Iphone phone2 = new Iphone("APPLE", "010-4444-4444");

        phone2.setOnlineStrategy(new WIFI()); // 기본 Wi-Fi
        phone2.connect();
        phone2.getPhoneNumber();


        phone2.setOnlineStrategy(new LTE());  // 상황 변화 → LTE 전환
        phone2.connect();

        phone.call("010-4444-4444");
        phone.ring("010-7777-7777");


    }
}