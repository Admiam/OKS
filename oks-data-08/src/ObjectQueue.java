interface IQueue {
    void enqueue(Object x);
    Object dequeue();
    Object peek();
}
public class ObjectQueue {
    private Node front;
    private Node rear;

    public ObjectQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(Object value) {
        Node newNode = new Node(value);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Object dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        Object value = front.value;
        front = front.next;
        return value;
    }

    public Object peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    private static class Node {
        private Object value;
        private Node next;

        private Node(Object value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ObjectQueue queue = new ObjectQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
class MyGenericQueue<T> implements IQueue {
    private ObjectQueue queue;

    public MyGenericQueue() {
        queue = new ObjectQueue();
    }

    public void enqueue(Object x) {
        queue.enqueue(x);
    }

    public Object dequeue() {
        return queue.dequeue();
    }

    public Object peek() {
        return queue.peek();
    }

    public static void main(String[] args) {
        MyGenericQueue<Integer> queue = new MyGenericQueue<>();
        queue.enqueue(1);
        System.out.println(queue.peek());
    }
}
