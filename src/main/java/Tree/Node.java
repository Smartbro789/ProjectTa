package Tree;

public class Node {

    private final int RED = 0;
    private final int BLACK = 1;

    private final Node nil = new Node(-1);
    private Node root = nil;

    int key = -1, color = BLACK;
    Node left = nil, right = nil, parent = nil;

        public Node(int key) {
            this.key = key;
        }

}
