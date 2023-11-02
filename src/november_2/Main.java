package november_2;

import november_2.classwork.Stack;

public class Main {

    public static void main(String[] args) {

        new StackImplementation();

    }

    static class StackImplementation {

        private final Stack stack;
        StackImplementation() {
            stack = new Stack(10);

            tryToPop();
            tryToPush(5);
            tryToPush(3);
            tryToPush(8);
            tryToPush(9);
            tryToPop();
            tryToPop();
            tryToPop();
            tryToPop();
            tryToPop();
            tryToPush(9);

            stack.traverse();

        }

        void tryToPush(int value) {
            if (stack.isStackFull()) System.out.println("Stack overflow");
            else {
                stack.push(value);
                System.out.println("+Pushed : " + value);
            }
        }

        void tryToPop() {
            if (stack.isStackEmpty()) System.out.println("Stack underflow");
            else System.out.println("-Popped : " + stack.pop());
        }

    }

}
