package week6.PtInterFace;

import java.io.PrintStream;

public class UsePrinter {

    public static void doPrint(Printer printer) {
        String text;
        text = " 테스트 페이지 입니다";
        Printer.print(text);
    }

}
