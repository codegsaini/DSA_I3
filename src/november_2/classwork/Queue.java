package november_2.classwork;

public class Queue {

    private int front = -1;
    private int rear = -1;
    private final int[] queue;
    private final int queueLength;

    private boolean queueFull = false;
    private boolean queueEmpty = true;

    public Queue(int queueLength) {
        this.queueLength = queueLength;
        queue = new int[queueLength];
    }

    public void enqueue(int value) {

        if (rear == queueLength - 1) {
            queueFull = true;
            return;
        }

        if (front == -1) front = 0;
        queueEmpty = false;

        queue[++rear] = value;
    }

    public int dequeue() {

        if (front == -1) return -1;

        int dequeuedValue = queue[front];

        if (front == rear || front == queueLength - 1) front = -1;

        queueEmpty = front++ == -1;

        return dequeuedValue;
    }

    public void traverse() {
        System.out.print("| ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " |");
        }
    }

    public boolean isEmpty() {
        return queueEmpty;
    }

    public boolean isFull() {
        return queueFull;
    }

}
