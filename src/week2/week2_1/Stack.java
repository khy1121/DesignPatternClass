package week2.week2_1;

import java.util.Vector;

public class Stack {
    Vector<String> stk = new Vector<>();
    private int top = -1;


    public void push(String item){
        stk.add(item);
        top ++;
    }
    public String pop(){
        top--;
        return stk.remove(stk.size()-1);

    }
    public String top(){ return stk.elementAt(stk.size()-1); }
    public void isEmpty(){
        if(stk.isEmpty()){ System.out.println("stack is empty"); }
        else { System.out.println("stack is not empty"); }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("1번");
        s.push("2번");
        s.push("3번");
        s.push("4번");
        System.out.println(s.top());

        //4 꺼내기
        s.pop();
        System.out.println(s.top());

        //3 꺼내기
        s.pop();
        System.out.println(s.top());

        //2 꺼내기
        s.pop();
        System.out.println(s.top());
        s.isEmpty();

        //1 꺼내기
        s.pop();
        s.isEmpty();
    }
}


