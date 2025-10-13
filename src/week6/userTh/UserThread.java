package week6.userTh;

import week6.printer.Printer;

public class UserThread extends Thread {
    public UserThread(String name) {
        super(name);
    }

    public void run() {
        Printer printer = Printer.getPrinter();
        printer.print(Thread.currentThread().getName() +
                " print using " + printer.toString() + ".");
    }

}
