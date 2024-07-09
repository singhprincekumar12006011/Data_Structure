//wap to print the node of tree line by line. After print the node of level it will change the line.

import java.util.*;
class Node 
{
    int key;
    Node left, right;
    Node (int k)
    {
        key = k;
        left = right = null;
    }
}

public class levelOrderLineByLine { 
    public static void main(String[] Prince)
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
        printlevel(root);
    }
    public static void printlevel(Node root) 
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(q.size() > 1)
        {
            Node curr = q.poll();
            if(curr == null)
            {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key + " ");
            if(curr.left != null) 
            {
                q.add(curr.left);
            }
            if(curr.right != null)
            {
                q.add(curr.right);
            }
        }
    }
}
