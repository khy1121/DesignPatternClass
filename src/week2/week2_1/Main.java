package week2.week2_1;

import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Vector<String> stack = new Vector<String>();

    public void push(String item){
        stack.add(item);
    }

    public String pop(){
        return stack.remove(stack.size()-1);
    }

    public String peek(){
        return stack.elementAt(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Main main = new Main();
        main.push("test1");
        main.push("test2");
        main.push("test3");
        main.push("test4");
        System.out.println(main.peek()); // 4
        main.pop(); // 3 2 1 (4 꺼내기)
        System.out.println(main.peek()); // 3
        main.pop(); // 2 1 (3 꺼내기)
        System.out.println(main.peek()); // 2
        main.pop(); // 1 (2 꺼내기)
        System.out.println(main.peek()); // 1
        System.out.println(main.isEmpty()); // 안비었으니 FALSE
        main.pop(); // 빈 상태 ( 1 꺼내기 )
        System.out.println(main.isEmpty()); // 비었으니 TRUE
    }
}