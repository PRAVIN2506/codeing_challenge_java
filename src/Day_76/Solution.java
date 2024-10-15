package Day_76;

class Solution {
    public static void main(String[] args) {
        Solution solution= new Solution();
        String s="101";
        System.out.println(solution.minimumSteps(s));
    }
    public long minimumSteps(String s) {
        long swap = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                swap += (long) black;
            else
                black++;
        }
        return swap;
    }
}
