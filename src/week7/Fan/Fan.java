package week7.Fan;

public class Fan {

    private State state;
    private boolean power_on = false;

    public Fan() {
        this.state = new Off(this);
        this.power_on = true;
    }

    public void On(){
        state.sys_on(this);
    }

    public void Off(){
        state.sys_off(this);
    }

    public void Run(){
        state.fan_run(this);
    }

    public void Stop(){
        state.fan_stop(this);
    }

    public boolean isPowerOn() {
        return power_on;
    }

    public void setState(State state) {
        this.state = state;
    }
}
