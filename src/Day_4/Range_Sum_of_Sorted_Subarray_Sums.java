package Day_4;

import java.util.Arrays;

public class Range_Sum_of_Sorted_Subarray_Sums {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        int n = nums.length;
        int left =6;
        int right =6;

        int[] arr = new int[n * (n + 1) / 2];
        for (int i = 0, k = 0; i < n; ++i) {
            int s = 0;
            for (int j = i; j < n; ++j) {
                s += nums[j];
                arr[k++] = s;
            }
        }
        Arrays.sort(arr);
        int ans = 0;
        final int mod = (int) 1e9 + 7;
        for (int i = left - 1; i < right; ++i) {
            ans = (ans + arr[i]) % mod;
        }
        System.out.println(ans);
    }
}
