package algorithmn.bst;

import java.util.Stack;

public class Node {
    private final int data;
    private Node left;
    private Node right;

    public Node(final int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public static Node insertRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (node.data < data) {
            node.right = insertRecursive(node.right, data);
        } else {
            node.left = insertRecursive(node.left, data);
        }

        return node;
    }

    public static void traversPostOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        traversPostOrderRecursive(node.left);
        traversPostOrderRecursive(node.right);

        System.out.println(node.data);
    }

    public static void traversPreOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.data);

        traversPostOrderRecursive(node.left);
        traversPostOrderRecursive(node.right);

    }

    public static void traversMidOrderRecursive(Node node) {
        if (node == null) {
            return;
        }

        traversPostOrderRecursive(node.left);
        System.out.println(node.data);
        traversPostOrderRecursive(node.right);
    }

    public static void traversPostOrder(Node root) {
        Stack<Node> nodes = new Stack<>();
        Stack<Node> stack = new Stack<>();

        nodes.add(root);

        while (!nodes.empty()) {
            Node node = nodes.pop();

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }

            stack.add(node);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop().data);
        }
    }

    public static Node copyRecursive(Node node) {
        if (node == null) {
            return null;
        }

        Node newNode = new Node(node.data);
        newNode.left = copyRecursive(node.left);
        newNode.right = copyRecursive(node.right);

        return newNode;
    }
}
