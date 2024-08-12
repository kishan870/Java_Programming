
//Program to demonstrate circular queue operations using arrays
public class CircularQueueUsingArray {
    private int[] arr;
    private int topOfQueue;
    private int endOfQueue;
    private int sizeOfQueue;

    public CircularQueueUsingArray(int size) {
        arr = new int[size];
        topOfQueue = -1;
        endOfQueue = -1;
        sizeOfQueue = 0;
        System.out.printf("Successfully created circular queue with size %d\n", size);
    }

    public boolean isEmpty() {
        return sizeOfQueue == 0;
    }

    public boolean isFull() {
        return sizeOfQueue == arr.length;
    }

    public void enqueue(int x) {
        if(isFull()) {
            System.out.printf("Queue is full. Unable to insert %d into the queue\n", x);
            return;
        }

        topOfQueue = Math.max(0, topOfQueue);
        endOfQueue = (endOfQueue + 1) % arr.length;
        arr[endOfQueue] = x;
        sizeOfQueue++;

        System.out.printf("Successfully inserted %d into the circular queue. Circular Queue size is %d\n", x, sizeOfQueue);
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Circular Queue is empty. Cannot dequeue.");
            return -1;
        }

        int x = arr[topOfQueue];
        topOfQueue = (topOfQueue + 1)%arr.length;
        sizeOfQueue--;

        System.out.printf("Dequeue successful. Removed element is %d\n", x);
        return x;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Circular Queue is empty. Nothing to peek.");
            return -1;
        }

        System.out.printf("Top of circular queue: %d\n", arr[topOfQueue]);
        return arr[topOfQueue];
    }

    public void displayQueue() {
        if(isEmpty()) {
            System.out.println("Circular Queue is empty. Nothing to display.");
            return;
        }

        System.out.println("Displaying circular queue contents: ");

        int i=topOfQueue;
        for(int j=0; j<sizeOfQueue; j++) {
            System.out.println(arr[i]);
            i = (i+1)%arr.length;
        }
    }

    public static void main(String[] args) {
        CircularQueueUsingArray cqueue = new CircularQueueUsingArray(5);
        cqueue.displayQueue();

        cqueue.dequeue();

        cqueue.enqueue(6);
        cqueue.enqueue(8);
        cqueue.enqueue(5);
        cqueue.enqueue(4);
        cqueue.enqueue(7);
        cqueue.enqueue(11);

        cqueue.displayQueue();
        cqueue.peek();
        cqueue.dequeue();
        cqueue.peek();
        cqueue.displayQueue();

        cqueue.enqueue(9);
        cqueue.displayQueue();

    }

}


