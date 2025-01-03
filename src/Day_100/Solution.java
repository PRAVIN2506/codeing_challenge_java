package Day_100;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,1,3};
        int maximumBit =2;
        System.out.println(s.getMaximumXor(nums,maximumBit));
    }

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int xorr = nums[0];
        int maxXor = (1 << maximumBit) - 1;

        for (int i = 1; i < n; i++) {
            xorr ^= nums[i];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = xorr ^ maxXor;
            xorr ^= nums[n - 1 - i];
        }

        return ans;
    }
}
