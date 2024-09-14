package Day_44;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] arr={1,3,4,8};
        int[][] queries={{0,1},{1,2},{0,3},{3,3}};
    }
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n=arr.length;
        int[] pre=new int[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++) {
            pre[i]=pre[i-1]^arr[i];
        }
        int[] res=new int[queries.length];
        for(int k=0;k<queries.length;k++) {
            int i=queries[k][0];
            int j=queries[k][1];
            if(i==0) {
                res[k]=pre[j];
            } else {
                res[k]=pre[j]^pre[i-1];
            }
        }
        return res;
    }
}
