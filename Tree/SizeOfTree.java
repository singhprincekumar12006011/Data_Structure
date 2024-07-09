


//WAP to find the number of node in tree.
class Node {
    int key; 
    Node left, right;
    Node(int k)
    {
        key = k;
        left = right = null;
    }
}

public class SizeOfTree {
    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.right.left = new Node(90);
        root.left.right.right = new Node(5);
        int result = height(root);
        System.out.println("The number of node in the tree are " + result);
    }
    public static int height(Node root) 
    {
        if(root == null)
        {
            return 0;
        } else{
            return (1 + height(root.left) + height(root.right));
        }
    }
}
