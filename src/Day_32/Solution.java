package Day_32;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] original={1,2,3,4};
        int m =2;
        int n =2;
        System.out.println();
    }
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] result = new int[m][];

        for (int i = 0; i < m; i++) {
            result[i] = Arrays.copyOfRange(original, i * n, i * n + n);
        }

        return result;
    }
}

