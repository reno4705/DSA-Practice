import java.util.*;

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

public class rightview {
    static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        solve(root,0,ans);
        return ans;
    }

    static void solve(Node root, int level, List<Integer> lst) {
        if (root == null) return;
        if (lst.size() == level) lst.add(root.val);
        solve(root.right,level+1,lst);
        solve(root.left,level+1,lst);
    }
    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(15);

        ArrayList<Integer> ans = rightView(root);
        System.out.println(ans);
    }
}
