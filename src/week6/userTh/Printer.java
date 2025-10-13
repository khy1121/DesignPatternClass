package week6.userTh;

public class Printer {
    private static Printer printer = null;
    private int counter = 0;
    private Printer(){}

    public static Printer getPrinter(){
        //싱글턴 패턴에서 자주 보이는 형태
        if(printer == null) {
            try {
                Thread.sleep(1);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            printer = new Printer();
        }
        return printer;
    }


    public void print(String str){
        counter++;
        System.out.println(str+counter);
    }
}
