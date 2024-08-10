import java.util.Arrays;

public class StackUsingArray {
    private int top;
    private int[] arr;

    public StackUsingArray(int size) {
        this.top = -1;
        this.arr = new int[size];
        System.out.println("Stack successfully initialized");
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        System.out.println("Top of element: " + arr[top]);
        return arr[top];
    }

    public void push(int x) {
        if(isFull()) {
            System.out.println("Stack is full. Unable to push " + x);
            return;
        }

        arr[++top] = x;
        System.out.println("Successfully inserted " + x + " into the stack");
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int x = arr[top--];
        System.out.println("Popped Element: " + x);
        return x;
    }

    public void displayStack() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Displaying Stack contents: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(4);
        stack.push(9);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.peek();
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }

}
