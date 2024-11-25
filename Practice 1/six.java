import java.util.*;

public class six {

    public static int solve(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int left = 0; int right = height.length - 1; 
        int maxLeft = 0; int maxRight = 0;
        
        int totalWater = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) { 
                    maxLeft = height[left]; 
                } else { 
                    totalWater += maxLeft - height[left]; 
                }
                left++;
            } else {
                if (height[right] >= maxRight) { 
                    maxRight = height[right]; 
                } else {
                    totalWater += maxRight - height[right]; 
                }
                right--;
            }
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int[] nums = {3, 0, 1, 0, 4, 0, 2};
        int ans = solve(nums);
        System.out.println(ans);
    }
}
