public class LinkStack {
    private Node top;

    public LinkStack() {
        top = new Node();
    }

    public void add(int value) {
        Node newNode = new Node();
        if (top == null) {
            top.value = value;
        }else {
            newNode.value = value;
            newNode.next = top;
            top = newNode;
        }
    }

    public int get(){
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        return value;
    }
    public void print(){
        Node current = top;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkStack stack = new LinkStack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.print();
    }

    class Node {
        private int value;
        private Node next;
    }
}
