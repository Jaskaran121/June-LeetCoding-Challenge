import java.util.*;

public class InverseBinaryTreeDay1 {
    Node root;
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }

    public static Node invertTree(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            
            // Swapping childrens of a node;
            Node temp = current.left;
            current.left = current.right;
            current.right = temp;

            System.out.println(current.data);
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
        return root;
    }

    public static void main(String[] args){
        InverseBinaryTree tree_level = new InverseBinaryTree();

        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        invertTree(tree_level.root);
    }
}
