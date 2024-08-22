package Day_22;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(5);
    }
    public int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();

        int mask = (1 << bitLength) - 1;

        return num ^ mask;
    }
}
