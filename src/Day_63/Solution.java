package Day_63;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution s= new Solution();
        int [] arr={40,10,20,30};
        System.out.println(s.arrayRankTransform(arr));
    }
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> valueToRank = new HashMap<>();
        int[] sortedUniqueNumbers = Arrays.stream(arr).distinct().sorted().toArray();

        for (int i = 0; i < sortedUniqueNumbers.length; i++) {
            valueToRank.put(sortedUniqueNumbers[i], i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = valueToRank.get(arr[i]);
        }

        return arr;
    }
}

