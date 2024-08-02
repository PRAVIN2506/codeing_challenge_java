package Day_2;

public class min_swap {
    public static void main(String[] args) {
        int []nums={0,1,1,0,1,0};
        int n = nums.length;
        int totalOnes = 0;

        for (int num : nums) {
            totalOnes += num;
        }
        int currentOnes = 0;


        for (int i = 0; i < totalOnes; i++) {
            currentOnes += nums[i];
        }

        int maxOnes = currentOnes;

        for (int i = 0; i < n; i++) {
            currentOnes -= nums[i];
            currentOnes += nums[(i + totalOnes) % n];
            maxOnes = Math.max(maxOnes, currentOnes);
        }
        System.out.println(totalOnes-maxOnes);
    }
}
