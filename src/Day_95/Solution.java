package Day_95;

class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="abcde";
        String goal="cdeab";
        System.out.println(solution.rotateString(s,goal));
    }
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}
