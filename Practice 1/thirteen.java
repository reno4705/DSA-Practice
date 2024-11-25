import java.util.*;

public class thirteen {
    public static boolean check(String str) {
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                s.push(c);
            }
            else {
                if (!s.isEmpty()) {
                    s.pop();
                }
                else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String str = "((()))()()";
        // String str = ")(";
        boolean ans = check(str);
        if (ans) System.out.println("Balanced");
        else System.out.println("Unbalanced");
    }
}
