package week7.Fan;

import java.io.Serializable;

public class Working implements State {
    private Fan fan;

    public Working(Fan fan) {
        this.fan = fan;
    }


    @Override
    public void sys_on(Fan fan) {
        System.out.println("이미 켜져있습니다");
    }

    @Override
    public void sys_off(Fan fan) {
        System.out.println("전원을 끕니다");
    }

    public void fan_run(Fan fan) {
        System.out.println("선풍기가 작동중입니다.");
    }
    public void fan_stop(Fan fan) {
        System.out.println("선풍기 이미 멈춰있습니다");
    }


}
