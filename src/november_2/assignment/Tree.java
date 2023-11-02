package november_2.assignment;

public class Tree {

    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public Node root;

    public Tree(int rootValue) {
        this.root = new Node(rootValue);
    }

    public void addNode(int value) {
        root = addRecursively(root, value);
    }

    public Node addRecursively(Node currentNode, int value) {

        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = addRecursively(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = addRecursively(currentNode.right, value);
        }
        return currentNode;
    }

    public void mirrorTree(Node currentNode) {

        if (currentNode == null) return;

        Node temp = currentNode.left;
        currentNode.left = currentNode.right;
        currentNode.right = temp;

        mirrorTree(currentNode.left);
        mirrorTree(currentNode.right);

    }

    public void inOrder(Node current) {

        if (current == null) return;

        inOrder(current.left);
        System.out.print(" " + current.value + " ");
        inOrder(current.right);

    }

}