package Day_52;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        int n=13;
        int k=2;
        System.out.println(s.findKthNumber(n,k));

    }
    private int getReqNum(long a, long b, long n) {
        int gap = 0;
        while (a <= n) {
            gap += Math.min(n + 1, b) - a;
            a *= 10;
            b *= 10;
        }
        return gap;
    }

    public int findKthNumber(int n, int k) {
        long num = 1;
        for (int i = 1; i < k;) {
            int req = getReqNum(num, num + 1, n);
            if (i + req <= k) {
                i += req;
                num++;
            } else {
                i++;
                num *= 10;
            }
        }
        return (int) num;
    }
}
