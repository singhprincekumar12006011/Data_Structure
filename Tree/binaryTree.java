class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class binaryTree {
    Node root;

    binaryTree() {
        root = null;
    }

    void inorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(5);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(7);
        tree.root.right.left = new Node(15);
        tree.root.right.right = new Node(25);

        System.out.println("Inorder traversal of the binary tree:");
        tree.inorderTraversal(tree.root);
    }
}
