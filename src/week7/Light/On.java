package week7.Light;

public class On implements State {
    private Light light;

    public On(Light light) {
        this.light = light;
    }

    public void On(Light light) {
        System.out.println("Light Sleeping");
        light.setState(new Sleeping(light));
    }
    public void Off(Light light) {
        System.out.println("light off");
        light.setState(new Off(light));
    }

}
