package november_2;

import november_2.classwork.Queue;
import november_2.classwork.Stack;
import november_2.assignment.Tree;

public class Main {

    public static void main(String[] args) {

        new TreeImpl(20);

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
            if (stack.isFull()) System.out.println("Stack overflow");
            else {
                stack.push(value);
                System.out.println("+Pushed : " + value);
            }
        }

        void tryToPop() {
            if (stack.isEmpty()) System.out.println("Stack underflow");
            else System.out.println("-Popped : " + stack.pop());
        }

    }

    static class QueueImpl {

        private final Queue queue;

        QueueImpl() {

            queue = new Queue(10);

            tryToEnqueue(6);
            tryToEnqueue(34);
            tryToEnqueue(63);
            tryToEnqueue(6345);
            tryToEnqueue(623);
            tryToEnqueue(6234);
            tryToEnqueue(6235);
            tryToEnqueue(62);
            tryToEnqueue(655);
            tryToEnqueue(6567);
            tryToEnqueue(6567);
            tryToEnqueue(6567);
            tryToEnqueue(6657);
            tryToEnqueue(6345);
            tryToDequeue();
            tryToDequeue();
            tryToDequeue();
            tryToDequeue();
            tryToDequeue();
            tryToDequeue();

            queue.traverse();

        }

        void tryToEnqueue(int value) {
            if (queue.isFull()) System.out.println("Queue overflow");
            else {
                queue.enqueue(value);
                System.out.println("+Enqueued : " + value);
            }
        }

        void tryToDequeue() {
            if (queue.isEmpty()) System.out.println("Queue underflow");
            else System.out.println("-Dequeued : " + queue.dequeue());
        }

    }

    static class TreeImpl {

        Tree tree;

        public TreeImpl(int rootValue) {
            tree = new Tree(rootValue);

            tree.addNode(3);
            tree.addNode(6);
            tree.addNode(2);
            tree.addNode(8);
            tree.addNode(9);
            tree.addNode(4);
            tree.addNode(67);
            tree.addNode(5);

            System.out.println();
            tree.inOrder(tree.root);

            tree.mirrorTree(tree.root);

            System.out.println();
            tree.inOrder(tree.root);
        }

    }

}
