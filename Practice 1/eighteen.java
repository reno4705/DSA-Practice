import java.util.*;

public class eighteen {
    public static int[] solve(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for (int i=n-1;i>=0;i--) {
            st.push(nums[i]);
        }
        int ans[] = new int[n];
        for (int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && st.peek()<=nums[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,3};
        int n = nums.length;
        int[] ans = solve(nums);
        for (int i=0;i<n;i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
