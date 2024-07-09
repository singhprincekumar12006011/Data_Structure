

//WAP to impleament the level order traversal. Print all the node value in one line.

import java.util.*;
class Node {
    int key;
    Node left, right;
    Node(int k)
    {
        key = k;
        left = right = null;
    }
}

public class LevelOrderTraversal {
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
        levelOrder(root);
    }
    public static void levelOrder(Node root) 
    {
        if(root == null) 
        {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty() == false) {
            Node curr = q.poll();
            System.out.print(curr.key + " ");
            //checking for the left node 
            if(curr.left != null) {
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            } 
        }
    }   
}
