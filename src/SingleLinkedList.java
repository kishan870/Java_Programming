
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

    static void insertListBegining(int nodeValue) {
        Node node = new Node(nodeValue);

        if(head == null) {
            head = node;
        }

        else {
            node.next = head;
            head = node;
        }

        System.out.println("Successfully inserted to the begining of the list");
    }

    static void insertListPosition(int nodeValue, int location) {
        Node node = new Node(nodeValue);

        if(head == null) {
            head = node;
            return;
        }

        Node current = head;
        int index = 1;
        while(current.next !=null  && index < location-1) {
            current = current.next;
            index++;
        }

        if(current.next == null) {
            current.next = node;
            tail = node;
        }

        else {
            node.next = current.next;
            current.next = node;
        }

        System.out.println("Successfully inserted node with value " + nodeValue + " at position " + location);
    }

    static void searchList(int nodeValue) {

        if(head == null) {
            System.out.println("List is empty");
        }

        else {
            Node current = head;
            int i=1;
            while(current != null) {
                if(current.value == nodeValue) {
                    System.out.println("The node with value " + nodeValue + " found at position " + i);
                    return;
                }

                current = current.next;
                i++;
            }

            System.out.println("Cannot find node with value " + nodeValue);
        }
    }

    static void displayList() {
        Node node = head;
        System.out.println("Display Linked List: ");

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        while(node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    static void deleteNode(int nodeValue) {

        if(head == null) {
            System.out.println("Cannot delete from empty list");
        }

        else if(head.value == nodeValue) {
            head = head.next;

            if(head == null) {
                tail = null;
            }
        }

        else {
            Node current = head;
            while(current.next.next != null) {
                if(current.value == nodeValue) {
                    current.value = current.next.value;
                    current.next = current.next.next;
                    break;
                }

                current = current.next;
            } 

        if(tail.value == nodeValue) {
            tail = current;
            current.next = null;
        }

        System.out.println("Successfully deleted node with value " + nodeValue);
        
        }

    }

    public static void main(String[] args) {
        createListNode(5);
        displayList();

        createListNode(6);
        displayList();

        createListNode(7);
        displayList();

        insertListBegining(3);
        displayList();

        insertListPosition(4, 3);
        displayList();

        insertListPosition(8, 9);
        displayList();

        searchList(5);
        searchList(7);
        searchList(11);

        deleteNode(5);
        displayList();

        deleteNode(8);
        displayList();

        deleteNode(3);
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
