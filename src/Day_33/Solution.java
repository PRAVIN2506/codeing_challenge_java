package Day_33;


class Solution {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] chalk={5,1,5};
        int k= 22;
        System.out.println(s.chalkReplacer(chalk,k));
    }
    public int chalkReplacer(int[] chalk, int initialChalkPieces) {
        long totalChalkNeeded = 0;
        for (int studentChalkUse : chalk) {
            totalChalkNeeded += studentChalkUse;
        }

        int remainingChalk = (int)(initialChalkPieces % totalChalkNeeded);

        for (int studentIndex = 0; studentIndex < chalk.length; studentIndex++) {
            if (remainingChalk < chalk[studentIndex]) {
                return studentIndex;
            }
            remainingChalk -= chalk[studentIndex];
        }

        return 0;
    }
}
