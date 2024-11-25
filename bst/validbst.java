class Node {
    int val;
    Node left;
    Node right;

    public Node(int data) {
        this.val = data;
        left = null;
        right = null;
    }
}

public class validbst {

    public static boolean isvalid(Node root) {
        return solve(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean solve(Node root, int min, int max) {
        if (root == null) return true;
        if (min >= root.val || max <= root.val) {
            return false;
        }
        return solve(root.left, min, root.val) && solve(root.right, root.val, max);
    }
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(15);

        boolean flag = isvalid(root);
        System.out.println(flag);
    }
}