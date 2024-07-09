// WAP to print the largest node(element) in tree

/**class Node {
    int key;
    Node left, right;
    Node(int k)
    {
        key = k;
        left = right = null;
    }
}

public class maxBinary {

    public static void main(String[] Prince)
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.left = new Node(70);
        root.left.right.left = new Node(90);
        root.left.right.right = new Node(5);
        int result = maxElement(root);
        System.out.println("The largest nodes in this tree is " + result);
    }
    public static int maxElement(Node root)
    {
        if(root == null)
        {
            return 0;
        } else {
            return Math.max(root.key, Math.max(maxElement(root.left), maxElement(root.right)));
        }
    }
}
    */