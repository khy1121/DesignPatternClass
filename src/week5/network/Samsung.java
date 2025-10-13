package week5.network;

public class Samsung extends Mobile {
    public Samsung(String manufacturer, String phoneNumber) {
        super(manufacturer, phoneNumber);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setOnlineStrategy(OnlineStrategy os) {
        super.setOnlineStrategy(os);
    }

    @Override
    public void connect() {
        super.connect();
    }

    @Override
    public void call(String number) {
        super.call(number);
    }

    @Override
    public void ring(String number) {
        super.ring(number);
    }
}
