package algorithmn.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Node {
    private final int data;
    private ArrayList<Node> children;

    public Node(int data) {
        this.data = data;
    }

    public void addChildren(ArrayList<Node> nodes) {
        this.children = nodes;
    }

    public void searchDepthFirst(Node head) {
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
}
