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
}