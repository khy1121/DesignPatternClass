package week6.printer;

public class Printer {
    private static Printer printer = null;
    private Printer(){}



    public static Printer getPrinter(){
        //싱글턴 패턴에서 자주 보이는 형태
        if(printer == null){
            printer = new Printer();
        }
        return printer;
    }


    public void print(String text){
        System.out.println(text);
    }
}
