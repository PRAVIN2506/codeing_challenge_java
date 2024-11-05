package Day_97;

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="1001";
        System.out.println(solution.minChanges(s));
    }
    public int minChanges(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
