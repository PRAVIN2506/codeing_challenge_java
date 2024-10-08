package Day_69;

class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="][][";
        System.out.println(solution.minSwaps(s));
    }
    public int minSwaps(String s) {
        int cnt = 0, ans = 0;
        for(char c : s.toCharArray()) {
            if(c == '[') cnt += 1;
            else if (cnt > 0) cnt--;
            else {
                cnt++;
                ans++;
            }
        }
        return ans;
    }
}
