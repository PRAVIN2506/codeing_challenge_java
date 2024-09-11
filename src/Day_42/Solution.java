package Day_42;

class Solution {
    public static void main(String[] args) {
        Solution s =new Solution();
        System.out.println(s.minBitFlips(10,7));
    }
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        int xor = start ^ goal;

        while(xor!=0){
            ans += xor & 1;

            xor >>=1;
        }
        return ans;
    }
}
