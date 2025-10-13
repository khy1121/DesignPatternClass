package org.example;

import java.io.PrintStream;

public class RealPrinter1 implements Printer {

    //인터페이스 Printer 를 정의
    private static Printer printer = null;
    //private 으로 외부 접근 불가
    private RealPrinter1() {}

    // 프린터가 null 인 경우엔 진짜 프린터 생성
    // null 이 아니면 프린터 리턴
    public synchronized static Printer getPrinter() {
        if(printer == null) {
            printer = new RealPrinter1();
        }
        return printer;
    }

    @Override
    public void print(String text) {
        //실제 프린터 구현 하는 코드
    }
}
