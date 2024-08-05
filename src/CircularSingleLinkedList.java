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

    public static void main(String[] args) {
        CircularSingleLinkedList CSLL = new CircularSingleLinkedList();

        CSLL.createCircularNode(5);
        CSLL.display();

        CSLL.createCircularNode(10);
        CSLL.display();
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
