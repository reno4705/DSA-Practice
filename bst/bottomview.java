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

public class bottomview {
    static ArrayList<Integer> bottomView(Node root) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair<Node,Integer>> q = new LinkedList<>();
        if (root == null) return new ArrayList<>();
        q.add(new Pair<>(root,0));
        while (!q.isEmpty()) {
            Pair<Node,Integer> curr = q.poll();
            Node node = curr.getKey();
            int level = curr.getValue();
            map.put(level,node.val);
            if (node.left!=null) q.add(new Pair<>(node.left,level-1));
            if (node.right!=null) q.add(new Pair<>(node.right,level+1));
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        ArrayList<Integer> ans = bottomView(root);
        System.out.println(ans);
    }
}
