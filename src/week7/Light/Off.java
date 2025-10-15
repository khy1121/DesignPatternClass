package week7.Light;

public class Off implements State {
    private Light light;

    public Off(Light light) {
        this.light = light;
    }


    public void On(Light light) {
        System.out.println("light on");
        light.setState(new On(light));
    }
    public void Off(Light light) {
        System.out.println("반응 없음");

    }
}
