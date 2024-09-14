package Day_45;

class Solution {
    public static void main(String[] args) {
        int [] nums ={1,2,3,3,2,2};
        System.out.println(new Solution().longestSubarray(nums));
    }
    public int longestSubarray(int[] nums) {
        int len = 1;

        int mx = Integer.MIN_VALUE;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }

        int tmp_len = 0;
        for (int num : nums) {
            if (num == mx) {
                tmp_len++;
            } else {
                len = Math.max(len, tmp_len);
                tmp_len = 0;
            }
        }

        len = Math.max(len, tmp_len);

        return len;
    }
}
