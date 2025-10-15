package Theme;

public class Main {

    private static final int THREAD_NUM = 2;

    public static void main(String[] args) {
        Button button = new Button("Submit");
        TextField textField = new TextField("Enter your name");
        Label label = new Label("Username");

        Runnable show = () -> {
            button.display();
            textField.display();
            label.display();
        };

        // 1) 배치 1: 기본(light) 테마로 동시 출력
        Thread[] light1 = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            light1[i] = new Thread(show, "show-1-" + (i + 1));
            light1[i].start();
        }
        for (Thread t : light1) {
            try { t.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }

        System.out.println();
        // 2) 테마 변경: dark
        Theme.getInstance().setThemeColor("dark");

        // 3) 배치 2: dark 테마로 동시 출력
        Thread[] dark1 = new Thread[THREAD_NUM];
        for (int i = 0; i < THREAD_NUM; i++) {
            dark1[i] = new Thread(show, "show-2-" + (i + 1));
            dark1[i].start();
        }
        for (Thread t : dark1) {
            try { t.join(); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}