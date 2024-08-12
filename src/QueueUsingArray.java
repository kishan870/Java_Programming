
//Program to demonstrate queue operations using arrays
public class QueueUsingArray {
    private int[] arr;
    private int beginingOfQueue;
    private int topOfQueue;

    public QueueUsingArray(int size) {
        arr = new int[size];
        beginingOfQueue = -1;
        topOfQueue = -1;
        System.out.printf("Successfully created queue with size %d\n", size);
    }

    public boolean isEmpty() {
        return topOfQueue == -1 || topOfQueue > beginingOfQueue;
    }

    public boolean isFull() {
        return beginingOfQueue == arr.length - 1;
    }

    public void enqueue(int x) {
        if(isFull()) {
            System.out.printf("Queue is full. Unable to insert %d into the queue\n", x);
            return;
        }

        arr[++beginingOfQueue] = x;
        topOfQueue = Math.max(topOfQueue, 0);

        System.out.printf("Successfully inserted %d into the queue. Queue size is %d\n", x, beginingOfQueue+1);
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int x = arr[topOfQueue++];
        System.out.printf("Dequeue successful. Removed element is %d\n", x);
        return x;
    }

    public void displayQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Nothing to display.");
            return;
        }

        System.out.println("Displaying queue contents: ");
        for(int i=topOfQueue; i<=beginingOfQueue; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.displayQueue();

        queue.dequeue();

        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(7);
        queue.enqueue(11);

        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
    }
}
