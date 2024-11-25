import java.util.*;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int low = 0;
        int high = n-1;
        int ans = 0;
        while (low <= high) {
            int area = (high-low) * Math.min(nums[low],nums[high]);
            if (nums[high] > nums[low]) {
                low++;
            }
            else {
                high--;
            }
            ans = Math.max(area,ans);
        }
        System.out.println(ans);
    }
}
