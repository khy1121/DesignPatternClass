package org.example;

public class FakePrinter implements Printer {
    private String text;

    @Override
    public void print(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    
}
