package Day_99;

class Solution {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] candidates={16,17,71,62,12,24,14};
        System.out.println(s.largestCombination(candidates));
    }
    public int largestCombination(int[] candidates) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int candidate : candidates) {
                if ((candidate & (1 << i)) != 0) cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
