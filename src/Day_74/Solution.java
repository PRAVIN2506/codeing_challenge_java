package Day_74;

import java.util.List;
import java.util.PriorityQueue;

import java.util.*;

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int curMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            minHeap.offer(new int[]{nums.get(i).get(0), i, 0});
            curMax = Math.max(curMax, nums.get(i).get(0));
        }
        int[] smallRange = new int[]{0, Integer.MAX_VALUE};
        while (true) {
            int[] curr = minHeap.poll();
            int curMin = curr[0], listIdx = curr[1], elemIdx = curr[2];
            if ((curMax - curMin < smallRange[1] - smallRange[0]) ||
                    (curMax - curMin == smallRange[1] - smallRange[0] && curMin < smallRange[0])) {
                smallRange[0] = curMin;
                smallRange[1] = curMax;
            }
            if (elemIdx + 1 < nums.get(listIdx).size()) {
                int nextVal = nums.get(listIdx).get(elemIdx + 1);
                minHeap.offer(new int[]{nextVal, listIdx, elemIdx + 1});
                curMax = Math.max(curMax, nextVal);
            } else {
                break;
            }
        }
        return smallRange;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<Integer>> nums = Arrays.asList(
                Arrays.asList(4, 10, 15, 24, 26),
                Arrays.asList(0, 9, 12, 20),
                Arrays.asList(5, 18, 22, 30)
        );

        int[] result = solution.smallestRange(nums);
        System.out.println("Smallest range: [" + result[0] + ", " + result[1] + "]");
    }
}

