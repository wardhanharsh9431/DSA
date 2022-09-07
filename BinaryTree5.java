class Node {
    int item;
    Node left, right;

    public Node(int key) {
        item = key;
        left = right = null;
    }
}

class BinaryTree5 {
    // root of Tree
    Node root;

    BinaryTree5() {
        root = null;
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // traverse the root node
        System.out.print(node.item + "->");
        // traverse the left child
        preorder(node.left);
        // traverse the right child
        preorder(node.right);
    }

    public static void main(String[] args) {
        // create object of tree
        BinaryTree5 tree = new BinaryTree5();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(12);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        // preorder tree traversal
        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);
    }
}