package Day_73;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[][] interavals={{5,10},{6,8},{1,5},{2,3},{1,10}};
        System.out.println(s.minGroups(interavals));
    }
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] start_times = new int[n];
        int[] end_times = new int[n];

        for (int i = 0; i < n; i++) {
            start_times[i] = intervals[i][0];
            end_times[i] = intervals[i][1];
        }

        Arrays.sort(start_times);
        Arrays.sort(end_times);

        int end_ptr = 0, group_count = 0;

        for (int start : start_times) {
            if (start > end_times[end_ptr]) {
                end_ptr++;
            } else {
                group_count++;
            }
        }

        return group_count;
    }
}