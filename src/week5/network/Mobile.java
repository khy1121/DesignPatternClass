package week5.network;

public abstract class Mobile {
    private final String manufacturer;
    private final String phoneNumber;
    private OnlineStrategy os;


    public Mobile(String manufacturer, String phoneNumber) {
        this.manufacturer = manufacturer;
        this.phoneNumber = phoneNumber;

        System.out.println(phoneNumber +"번호의 " +manufacturer +" 기종 사용 ");
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setOnlineStrategy(OnlineStrategy os) { this.os = os; }


    public void connect() {
        if (os==null) throw new IllegalStateException("네트워크가 연결되지 않았습니다. ");
        os.connect();
    }


    //추상 메소드로 바꿔야함.
    public void call(String number) { System.out.println(number + " 번호로 발신합니다."); }
    public void ring(String number) { System.out.println(number + " 번호로 벨이 울립니다."); }
  //  public  call(String number) ;
   // public  ring(String number){ System.out.println(number + " 번호로 벨이 울립니다."); }


}