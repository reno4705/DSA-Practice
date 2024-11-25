import java.util.*;

public class seven {
    public static void main(String[] args) {
        int[] nums = {7, 3, 2, 4, 9, 12, 56};
        int m = 5;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int j = m-1; int i = 0;
        while(j<n) {
            int diff = nums[j] - nums[i];
            min = Math.min(diff,min);
            i++; j++;
        }
        System.out.println(min);
    }
}
