package week7.Fan;

import week4.week4_report.W;

import javax.swing.text.Style;

public class On implements State {
    private Fan fan;
    public On(Fan fan) {

        this.fan = fan;
    }

    @Override
    public void sys_on(Fan fan) {
        if(fan.isPowerOn()){
            System.out.println("전원이 이미 켜져있습니다.");
            fan.setState(new On(fan));
        }
        else{  System.out.println("전원을 켜주세요");}
    }

    @Override
    public void sys_off(Fan fan) {
        System.out.println("전원을 끕니다");
        fan.setState(new Off(fan));
    }

    public void fan_run(Fan fan) {
        System.out.println("선풍기 작동합니다");
        fan.setState(new Working(fan));
    }
    public void fan_stop(Fan fan) {
        System.out.println("선풍기 작동을 멈춥니다.");
    }

}
