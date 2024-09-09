import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeOperations {

    private static TreeNode root = null;

    public static void main(String[] args) {
        
        TreeNode node1 = new TreeNode(6);
        TreeNode node11 = new TreeNode(5);
        TreeNode node12 = new TreeNode(8);
        TreeNode node111 = new TreeNode(3);
        TreeNode node1111 = new TreeNode(2);
        TreeNode node1112 =  new TreeNode(4);
        TreeNode node121 = new TreeNode(7);
        TreeNode node122 = new TreeNode(10);
        TreeNode node1221 = new TreeNode(9);

        node1.left = node11;
        node1.right = node12;
        node11.left = node111;
        node111.left = node1111;
        node111.right = node1112;
        node12.left = node121;
        node12.right = node122;
        node122.left = node1221;

        root = node1;

        System.out.println("Preorder Traversal: ");
        preOrder(root);

        System.out.println("");
        System.out.println("Inorder Traversal");
        inOrder(root);

        System.out.println("");
        System.out.println("PostOrder Traversal");
        postOrder(root);

        System.out.println("");
        System.out.println("LevelOrder Traversal");
        levelOrder(root);

        System.out.println("");
        boolean find = searchTree(-5, root);

        if(find)
            System.out.print("Node Found");
        else
            System.out.print("Node Not found");

        System.out.println("");
        insertNodeLevel(11, root);
        inOrder(root);


        System.out.println("-".repeat(10));
        deleteNode(10, root);
        deleteNode(10, root);
        inOrder(root);

    }

    public static void preOrder(TreeNode node) {
        if(node == null)
            return;

        System.out.print(node.value + " -> ");
        preOrder(node.left);
        preOrder(node.right);

    }

    public static void inOrder(TreeNode node) {
        if(node == null)
            return;

        inOrder(node.left);
        System.out.print(node.value + " -> ");
        inOrder(node.right);
    }

    public static void postOrder(TreeNode node) {
        if(node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " -> ");
    }

    public static void levelOrder(TreeNode node) {

        Queue<TreeNode> bfsQueue = new LinkedList<>();

        bfsQueue.add(node);

        while(bfsQueue.size() > 0) {
            TreeNode frontNode = bfsQueue.poll();
            System.out.print(frontNode.value + " -> ");

            if(frontNode.left != null)
                bfsQueue.add(frontNode.left);

            if(frontNode.right != null)
                bfsQueue.add(frontNode.right);
        }
    }

    public static boolean searchTree(int value, TreeNode root) {

        if(root == null)
            return false;

        if(root.value == value)
            return true;

        return searchTree(value, root.left) || searchTree(value, root.right);
    }

    public static void insertNodeLevel(int value, TreeNode root) {

        if(searchTree(value, root)) {
            System.out.println(value + " already exists in the tree");
            return;
        }

        TreeNode newNode = new TreeNode(value);

        Queue<TreeNode> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);

        while (bfsQueue.size() > 0) {
            TreeNode node = bfsQueue.poll();

            if(node.left == null) {
                node.left = newNode;
                System.out.println("Successfully inserted " + value + " to the tree");
                return;

            } else if(node.right == null) {
                node.right = newNode;
                System.out.println("Successfully inserted " + value + " to the tree");
                return;

            } else {
                bfsQueue.add(node.left);
                bfsQueue.add(node.right);
            }

        }

    }

    public static void deleteNode(int value, TreeNode root) {
        if(root == null) {
            System.out.println("Tree is empty. Cannot delete.");
            return;
        }

        if(root.value == value) {
            root = null;
            System.out.println("Successfully deleted " + value);
        }

        Queue<TreeNode> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);

        while (!bfsQueue.isEmpty()) {
            TreeNode node = bfsQueue.poll();
            
            if(node.left != null) {
                if(node.left.value == value) {
                    System.out.println("Successfully deleted " + value);
                    node.left = null;
                    return;

                } else {
                    bfsQueue.add(node.left);
                }
            }

            if(node.right != null) {
                if(node.right.value == value) {
                    System.out.println("Successfully deleted " + value);
                    node.right = null;
                    return;
                    
                } else {
                    bfsQueue.add(node.right);
                }
            }
        }

        System.out.println("Cannot delete " + value + " because it does not exist in the tree");
    }
}