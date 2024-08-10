public class StackUsingLinkedList {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(9);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        //stack.push(4);
        stack.peek();
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }
}

class LinkedListStack {
    private Node head;

    public LinkedListStack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        System.out.println("Top of the stack: " + head.value);
        return head.value;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int x = head.value;
        Node node = head.next;
        head.next = null;
        head = node;

        System.out.println("Top of the stack: " + x);   
        return x;     

    }

    public void push(int x) {

        Node node = new Node(x);
        node.next = head;
        head = node;
        System.out.println("Successfully pushed " + x + " into the stack");
    }

    public void displayStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Displaying stack contents");
        Node node = head;

        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

}
