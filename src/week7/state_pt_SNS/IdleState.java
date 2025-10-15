package week7.state_pt_SNS;

public class IdleState implements State {
private Article article;

    @Override
    public void like(Article article) {
        article.setState(new LikeState());
        System.out.println("좋아요");
    }

    @Override
    public void dislike(Article article) {
        article.setState(new DislikeState());
        System.out.println("싫어요");
    }
}
