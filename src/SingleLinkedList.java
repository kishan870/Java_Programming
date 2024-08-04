
//This program will demonstrate operations on single linked list
public class SingleLinkedList {

    static Node head=null, tail=null;

    static void createListNode(int nodeValue) {
        Node node = new Node(nodeValue);

        if(head == null) {
            head = node;
        }

        if(tail != null) {
            tail.next = node;
        }

        tail = node;
        System.out.println("Successfully created node with value: " + nodeValue);
    }

    static void displayList() {
        Node node = head;
        System.out.println("Display Linked List: ");

        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        createListNode(5);
        displayList();

        createListNode(6);
        displayList();

        createListNode(7);
        displayList();
    }
    
}

class Node {
    public int value;
    public Node next;

    public Node(int nodeValue) {
        this.value = nodeValue;
        this.next = null;
    }
}
