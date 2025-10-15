package week7.state_pt_SNS;

public class DislikeState implements State {

    @Override
    public void like(Article article) {
        article.setState(new LikeState());
        System.out.println("싫어요 -> 좋아요 로 바꿉니다");
    }

    @Override
    public void dislike(Article article) {
        article.setState(new IdleState());
        System.out.println("싫어요 취소 !");

    }
}
