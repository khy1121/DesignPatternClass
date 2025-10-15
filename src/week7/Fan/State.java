package week7.Fan;

public interface State {
    public void sys_on(Fan fan);
    public void sys_off(Fan fan);
    public void fan_run(Fan fan);
    public void fan_stop(Fan fan);
}
