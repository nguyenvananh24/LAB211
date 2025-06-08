package week3;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stackValues;

    public Stack() {
        stackValues = new ArrayList<>();
    }

    public void push(int value) {
        stackValues.add(value);
        System.out.println("Pushed " + value + " to the stack");
    }

    public Integer pop() {
        if (stackValues.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return null;
        }
        int value = stackValues.remove(stackValues.size() - 1);
        System.out.println("Popped " + value + " from the stack");
        return value;
    }

    public Integer get() {
        if (stackValues.isEmpty()) {
            System.out.println("Stack is empty. Nothing to get");
            return null;
        }
        return stackValues.get(stackValues.size() - 1);
    }

}
