package algorithmn.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class TreeRunner {
    public static void run() {
        Node head = new Node(50);
        Node node1 = new Node(1);
        Node node2 = new Node(12);
        Node node3 = new Node(33);
        Node node4 = new Node(44);
        Node node5 = new Node(35);
        Node node6 = new Node(36);
        Node node7 = new Node(57);
        Node node8 = new Node(58);
        Node node9 = new Node(99);
        Node node10 = new Node(10);
        Node node11 = new Node(110);
        Node node12 = new Node(120);
        Node node13 = new Node(133);
        Node node14 = new Node(140);
        Node node15 = new Node(15);
        Node node16 = new Node(32);
        Node node17 = new Node(170);
        Node node18 = new Node(18);
        Node node19 = new Node(19);

        head.addChildren(Arrays.asList(node1, node2, node3));
        node1.addChildren(Arrays.asList(node4, node5));
        node2.addChildren(Arrays.asList(node6, node7));
        node4.addChildren(Arrays.asList(node8, node9));
        node5.addChildren(Arrays.asList(node10, node11));
        node7.addChildren(Arrays.asList(node12));
        node8.addChildren(Arrays.asList(node13, node14));
        node9.addChildren(Arrays.asList(node15, node16));
        node12.addChildren(Arrays.asList(node17, node18, node19));

        Node.searchDepthFirst(head);
        System.out.println("-----------------------------");
        Node.searchDepthFirstRecursive(head);
    }
}
