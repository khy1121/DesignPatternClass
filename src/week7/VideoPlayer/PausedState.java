package week7.VideoPlayer;

public class PausedState implements State {
    @Override
    public void play(VideoPlayer player) {
        System.out.println("Resuming the video.");
        player.setState(new PlayingState());
    }

    @Override
    public void stop(VideoPlayer player) {
        System.out.println("Stopping the video.");
        player.setState(new StoppedState());
    }
}
