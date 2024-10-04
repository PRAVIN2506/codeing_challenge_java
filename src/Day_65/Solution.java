package Day_65;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] skills={3,2,5,1,3,4};
        System.out.println(s.dividePlayers(skills));
    }
    public long dividePlayers(int[] skill) {
        // Step 1: Sort the skill array
        Arrays.sort(skill);

        int n = skill.length;
        int totalSkill = skill[0] + skill[n - 1];
        long chemistrySum = 0;

        for (int i = 0; i < n / 2; i++) {
            if (skill[i] + skill[n - i - 1] != totalSkill) {
                return -1;
            }
            chemistrySum += (long) skill[i] * skill[n - i - 1];
        }

        return chemistrySum;
    }
}
