package Day_60;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] nums={10,2};
        System.out.println(s.largestNumber(nums));
    }
    public String largestNumber(int[] nums) {
        String[] array =  new String[nums.length];
        for(int i=0; i<nums.length; i++){
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array,(a, b)-> (b+a).compareTo(a+b));
        if(array[0].equals("0")){
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for(int i=0; i<array.length; i++){
            largest.append(array[i]);
        }
        return largest.toString();
    }
}