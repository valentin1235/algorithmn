package algorithmn.bst;

public class BSTRunner {
    public static void run() {
        Node root = new Node(50);

        Node.insertRecursive(root, 24);
        Node.insertRecursive(root, 42);
        Node.insertRecursive(root, 33);
        Node.insertRecursive(root, 22);

        Node.insertRecursive(root, 55);
        Node.insertRecursive(root, 52);
        Node.insertRecursive(root, 57);

        Node.traversPostOrderRecursive(root);
        System.out.println("-----------------------");
        Node.traversPostOrder(root);

        System.out.println("-----------------------");
        Node copy = Node.copyRecursive(root);
        Node.traversPostOrder(copy);
    }
}
