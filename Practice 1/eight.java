import java.util.*;

public class eight {
    public static void main(String[] args) {
        // int[][] nums = { { 1, 3 }, { 2, 4 }, { 6, 8 }, { 9, 10 } };
        int[][] nums = { { 7, 8 }, { 1, 5 }, { 2, 4 }, { 4, 6 } };
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int[][] ans = new int[nums.length][2]; ans[0][0] = nums[0][0]; ans[0][1] = nums[0][1];
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i][0] >= ans[j][0] && nums[i][0] <= ans[j][1]) {
                ans[j][1] = Math.max(ans[j][1],nums[i][1]);
            }
            else {
                j++;
                ans[j][0] = nums[i][0];
                ans[j][1] = nums[i][1];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i][0] != 0 && ans[i][1] != 0) System.out.print(ans[i][0] + " " + ans[i][1]);
            System.out.println();
        }
    }
}