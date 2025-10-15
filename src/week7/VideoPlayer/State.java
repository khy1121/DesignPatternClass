package week7.VideoPlayer;

public interface State {
    void play(VideoPlayer player);
    void stop(VideoPlayer player);
}