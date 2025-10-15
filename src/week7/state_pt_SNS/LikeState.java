package week7.state_pt_SNS;



public class LikeState implements State {


    @Override
    public void like(Article article) {
        article.setState(new IdleState());
        System.out.println("좋아요 취소!");
    }

    @Override
    public void dislike(Article article) {
        article.setState(new DislikeState());
        System.out.println("좋아요 -> 싫어요  로 바꿉니다");
    }
}
