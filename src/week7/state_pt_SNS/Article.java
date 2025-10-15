package week7.state_pt_SNS;

public class Article {

    private State state;
    public Article() {
        this.state = new IdleState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void likeClick(){
        state.like(this);
    }

    public void dislikeClick(){
        state.dislike(this);
    }
}
