import java.util.*;

public class seventeen {

    public static void solve(Stack<Integer> s, int n, int cur) {
        if (n == 0 || cur==n) {
            return;
        }
        int a = s.pop();
        solve(s,n,cur+1);
        if (cur != n/2) {
            s.push(a);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 5; i >= 1; i--)
            s.add(i);

            solve(s,s.size(),0);
            while (!s.isEmpty()) {
                System.out.print(s.pop() + " ");
            }
    }
}
