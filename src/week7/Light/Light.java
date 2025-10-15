package week7.Light;

public class Light {
    private State state;

    public Light() {
        this.state = new Off(this);  // 디폴트 꺼진상태
    }


    public void On() {
         state.On(this);
    }

    public void Off() {
         state.Off(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
