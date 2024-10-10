package Day_71;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        int []nums={1,2,3,4};
        System.out.println(s.maxWidthRamp(nums));
    }
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; ++i) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }

        int maxWidth = 0;

        for (int j = n - 1; j >= 0; --j) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }

        return maxWidth;
    }
}
