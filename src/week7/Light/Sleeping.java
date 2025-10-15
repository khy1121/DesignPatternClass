package week7.Light;

public class Sleeping implements State{
    private Light light;

    public Sleeping(Light light) {
        this.light = light;
    }

    public void On(Light light) {
        System.out.println("Light on");
        light.setState(new On(light));
    }

    public void Off(Light light) {
        System.out.println("Light is off");
        light.setState(new Off(light));
    }
}
