package Day_78;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        int num =109861;
        System.out.println(s.maximumSwap(11));
    }
    public int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[numArr[i] - '0'] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int d = 9; d > numArr[i] - '0'; d--) {
                if (last[d] > i) {
                    char temp = numArr[i];
                    numArr[i] = numArr[last[d]];
                    numArr[last[d]] = temp;
                    return Integer.parseInt(new String(numArr));
                }
            }
        }

        return num;
    }
}
