import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }

    Node(int val, Node left, Node right) {
        this.data = val;
        this.left = left;
        this.right = right;
    }
}

public class nineteen {
    public static List<Integer> rightview(Node root) {
        List<Integer> ans = new ArrayList<>();
        level(root, ans, 0);
        return ans;
    }

    public static void level(Node root, List<Integer> ans, int c) {
        if (root == null) {
            return;
        }
        if (c == ans.size()) {
            ans.add(root.data);
        }
        level(root.right, ans, c + 1);
        level(root.left, ans, c + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        System.out.println(rightview(root));
    }
}
