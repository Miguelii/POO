package Ficha4;

import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    // Construtor
    public Stack() {
        this.stack = new ArrayList<>();
    }

    // a)
    public String top() {
        if(this.stack.isEmpty() == false) {
            return this.stack.get(this.stack.size()-1);
        }
        else
            return null;
    }

    // b)
    public void push(String s) {
        this.stack.add(s);
    }

    // c)
    public void pop() {
        if(this.stack.isEmpty() == false) {
            this.stack.remove(this.stack.size()-1);
        }
    }

    // d)
    public boolean empty() {
        return this.stack.isEmpty();
    }

    // e)
    public int length() {
        return this.stack.size();
    }


}
