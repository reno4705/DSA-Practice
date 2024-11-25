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

class Pair<F, S> {
    F first;
    S second;

    public Pair(F key, S value) {
        this.first = key;
        this.second = value;
    }

    public F getKey() {
        return first;
    }

    public S getValue() {
        return second;
    }
}

public class topview {

    static ArrayList<Integer> topView(Node root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair<Node, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(root, 0));
        while (!q.isEmpty()) {
            Pair<Node, Integer> curr = q.poll();
            Node node = curr.getKey();
            int hd = curr.getValue();

            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            if (node.left != null) {
                q.add(new Pair<>(node.left, hd - 1));
            }

            if (node.right != null) {
                q.add(new Pair<>(node.right, hd + 1));
            }
        }
        return new ArrayList<>(map.values());
    }

    // static void solve(Node root, int hd, Map<Integer, Integer> map) {
    // if (root == null)
    // return;
    // if (!map.containsKey(hd)) {
    // map.put(hd, root.val);
    // }
    // solve(root.left, hd - 1, map);
    // solve(root.right, hd + 1, map);
    // }

    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(15);

        ArrayList<Integer> ans = topView(root);
        System.out.println(ans);
    }
}
