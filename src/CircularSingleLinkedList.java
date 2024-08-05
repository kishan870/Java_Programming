public class CircularSingleLinkedList {
    static CircularNode head = null, tail = null;
    static int size = 0;

    public void createCircularNode(int nodeValue) {
        CircularNode node = new CircularNode(nodeValue);
        size += 1;

        if(head == null) {
            head = node;
            tail = node;
        }

        else {
            tail.next = node;
            node.next = head;
            tail = node;
        }

        System.out.println("Successfully added node with value "+nodeValue);
    }

    public void display() {
        System.out.println("Displaying the circular linked list:");

        CircularNode curr = head;
        if(size == 1) {
            System.out.println(head.value);
            return;
        }

        for(int i=0; i< size; i++) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

    public void insertNode(int nodeValue, int index) {
        CircularNode node = new CircularNode(nodeValue);

        if(index <0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        size++;


        if(index == 0) {
            tail.next = node;
            node.next = head;
            head = node;
        }

        else if(index == size-1) {
            node.next = head;
            tail.next = node;
            tail = node;
        }

        else {
            CircularNode curr = head;

            for(int i=0; i<index-1; i++) {
                curr = curr.next;
            }

            System.out.println("Curr Value: " + curr.value);
            node.next = curr.next;
            curr.next = node;
        }

        System.out.println("Successfully inserted node with value " + nodeValue + " at position " + index);
    }

    public static void main(String[] args) {
        CircularSingleLinkedList csll = new CircularSingleLinkedList();

        csll.createCircularNode(5);
        csll.display();

        csll.createCircularNode(10);
        csll.display();

        csll.createCircularNode(12);
        csll.display();

        csll.insertNode(15, 2);
        csll.display();

        csll.insertNode(17, 4);
        csll.display();

        csll.insertNode(21, 7);
        csll.display();
    }
}

class CircularNode {
    public int value;
    public CircularNode next;

    public CircularNode(int nodeValue) {
        this.value = nodeValue;
        this.next = this;
    }
}
