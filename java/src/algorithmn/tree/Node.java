package algorithmn.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Node {
    private final int data;
    private List<Node> children = new ArrayList<>();

    public Node(int data) {
        this.data = data;
    }

    public void addChildren(List<Node> nodes) {
        this.children = nodes;
    }

    public List<Node> getChildren() {
        return children;
    }

    public int getData() {
        return data;
    }

    public static void searchDepthFirst(Node head) {
        Stack<Node> nodes = new Stack<>();
        Stack<Node> stack = new Stack<>();
        nodes.add(head);

        while (!nodes.empty()) {
            Node next = nodes.pop();

            for (Node node: next.children) {
                nodes.add(node);
            }

            stack.add(next);
        }

        while(!stack.empty()) {
            System.out.println(stack.pop().data);
        }
    }

    public static void searchDepthFirstRecursive(Node node) {
        if (node == null) {
            return;
        }

        for (Node child: node.getChildren()) {
            searchDepthFirstRecursive(child);
        }

        System.out.println(node.getData());
    }
}
