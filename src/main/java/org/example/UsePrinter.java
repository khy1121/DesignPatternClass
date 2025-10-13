package org.example;

public class UsePrinter {
    public void doPrint(Printer printer) {
        String text;

        text = "테스트 페이지 입니다";

        printer.print(text);
    }

}
