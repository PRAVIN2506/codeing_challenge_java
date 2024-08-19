package Day_19;

public class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(3);
    }
    public int minSteps(int n) {
        if (n == 1) return 0;

        int steps = 0;
        int factor = 2;

        while (n > 1) {
            while (n % factor == 0) {
                steps += factor;
                n /= factor;
            }
            factor++;
        }

        return steps;
    }
}
