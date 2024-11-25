import java.util.*;

public class sixteen {

    public static String solve(String[] strs) {
        String ans = "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int n = Math.min(first.length() , last.length());
        for (int i=0;i<n;i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans;
            }
            ans = ans + first.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] nums = {"geeksforgeeks", "geeks", "geek", "geezer"};
        // String[] nums = {"hello","world"};
        String s = nums[0]; 
        String ans = solve(nums);
        System.out.println(ans.length()==0 ? -1 : ans);
    }
}
