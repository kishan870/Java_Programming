public class QueueUsingLinkedList {
    private ListNode head;
    private ListNode tail;
    private int sizeOfQueue;

    public QueueUsingLinkedList() {
        head = null;
        tail = null;
        sizeOfQueue = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int x) {
        ListNode node = new ListNode(x);
        sizeOfQueue++;

        if(head == null)
            head = node;
        
        else
            tail.next = node;

        tail = node;
        System.out.printf("Successfully inserted %d into the queue. Queue size is %d\n", x, sizeOfQueue);
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }

        System.out.printf("Top of queue: %d\n", head.value);
        return head.value;
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return -1;
        }

        sizeOfQueue--;
        ListNode node = head;

        head = head.next;
        node.next = null;

        if(head == null)
            tail = null;

        System.out.printf("Dequeue successful. Removed element is %d\n", node.value);
        return node.value;
    }

    public void displayQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Nothing to display.");
            return;
        }

        ListNode node = head;
        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(5);
        System.out.println(node.value);

        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.displayQueue();

        queue.dequeue();

        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(7);
        //queue.enqueue(11);

        queue.displayQueue();
        queue.peek();
        queue.dequeue();
        queue.peek();
        queue.displayQueue();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

    }
    
}

class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
