import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeUsingArray {
    public static void main(String[] args) {
        
        BinTreeNode newTree = new BinTreeNode(9);
        newTree.insert("N1");
        newTree.insert("N2");
        newTree.insert("N3");
        newTree.insert("N4");
        newTree.insert("N5");
        newTree.insert("N6");
        newTree.insert("N7");
        newTree.insert("N8");
        newTree.insert("N9");
        newTree.insert("N10");

        System.out.println("-".repeat(15));
        newTree.preOrder(1);

        System.out.println("-".repeat(15));
        newTree.inOrder(1);

        System.out.println("-".repeat(15));
        newTree.postOrder(1);

        System.out.println("-".repeat(15));
        newTree.levelOrder(1);

    }
}

class BinTreeNode {

    String[] arr;
    int lastUsedIndex;

    public BinTreeNode(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " has been ceated");
    }

    public boolean isFull() {
        return lastUsedIndex == arr.length - 1;
    }

    public void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("Successfully inserted " + value + " to binary tree");

        } else {
            System.out.println("Binary tree is full. Cannot insert");
        }
    }

    public void preOrder(int index) {
        if(index > lastUsedIndex)
            return;

        System.out.print(arr[index] + " -> ");
        preOrder(index * 2);
        preOrder(index*2 + 1);
    }

    public void inOrder(int index) {
        if(index > lastUsedIndex)
            return;

        inOrder(index*2);
        System.out.print(arr[index] + " -> ");
        inOrder(index*2 + 1);
    }

    public void postOrder(int index) {
        if(index > lastUsedIndex)
            return;

        postOrder(index*2);
        postOrder(index*2 + 1);
        System.out.print(arr[index] + " -> ");
    }

    public void levelOrder(int index) {
        if(index > lastUsedIndex)
            return;

        Queue<Integer> bfsQueue = new LinkedList<>();

        bfsQueue.add(index);

        while (!bfsQueue.isEmpty()) {
            int indexOnTop = bfsQueue.poll();
            System.out.print(arr[indexOnTop] + " -> ");

            int leftIndex = indexOnTop*2;
            int rightIndex = leftIndex+1;

            if(leftIndex <= lastUsedIndex) 
                bfsQueue.add(leftIndex);

            if(rightIndex <= lastUsedIndex)
                bfsQueue.add(rightIndex);
        }
    }
}
