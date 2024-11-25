import java.util.*;

public class fourteen {
    public static void main(String[] args) {
        // String s1 = "geeks";
        // String s2 = "kseeg";
        String s1 = "allergy";
        String s2 = "allergic";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s1.length();i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i),0)-1);
        }

        boolean flag = true;
        for (char key : map.keySet()) {
            if (map.get(key) != 0) {
                flag = false;
                System.out.println(flag);
                break;
            }
        }
        if (flag) System.out.println(flag);
    }
}
