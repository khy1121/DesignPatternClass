package week7.Cafe;

public interface State {
    void Ordered();
    void Making();
    void Complete();
    String getState();

}
