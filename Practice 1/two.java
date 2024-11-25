import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for (int i=0;i<n;i++) {
            prefix *= nums[i]; 
            suffix *= nums[n-i-1];
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;
            max = Math.max(max, Math.max(prefix, suffix));
        }
        System.out.println(max);
        
    }
}