import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int key = sc.nextInt();
        for (int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1; 
        boolean flag = false;
        while (left <= right) {
            int mid = (left+right)/2;
            if (nums[mid] == key) {
                flag = true;
                System.out.println("index: "+ mid);
                break;
            }
            else if (nums[left] <= nums[mid]) {
                if (key >= nums[left] && key <= nums[mid]) {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            else { 
                if (key >= nums[mid] && key <= nums[right]) {
                    left = mid+1;
                }
                else {
                    right = mid+1;
                }
            }
        }
        if (!flag) System.out.println(-1);
    }
}
