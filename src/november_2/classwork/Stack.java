package november_2.classwork;

import java.util.Scanner;

public class Stack {
    private int top = -1;
    private final int[] stack;
    private final int stackLength;

    private boolean stackEmpty = true;
    private boolean stackFull = false;

    public Stack(int stackLength) {
        this.stackLength = stackLength;
        stack = new int[stackLength];
    }

    public void push(int value) {

        if (top == stackLength - 1) {
            stackFull = true;
            return;
        }
        stack[++top] = value;
        stackEmpty = top == 0;
    }

    public int pop() {

        if (top == -1) return -1;

        stackEmpty = top == 0;
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return stackEmpty;
    }

    public boolean isFull() {
        return stackFull;
    }

    public void traverse() {
        System.out.println("----");
        for (int i = 0; i <= top; i++) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("----");
    }

}
