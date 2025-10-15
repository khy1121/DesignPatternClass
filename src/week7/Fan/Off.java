package week7.Fan;

public class Off implements State {

    private Fan fan;
    public Off(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void sys_on(Fan fan) {
        System.out.println("전원을 킵니다.");
        fan.setState(new On(fan));
    }

    @Override
    public void sys_off(Fan fan) {
        System.out.println("전원이 이미 꺼져있습니다.");
    }


    public void fan_run(Fan fan) {
        System.out.println("전원을 먼저 켜주세요");
    }
    public void fan_stop(Fan fan) {
        System.out.println("전원을 먼저 켜주세요");
    }
}
