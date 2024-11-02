package Day_94;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        String sentence="leetcode exercises sound delightful";
        System.out.println(s.isCircularSentence(sentence));
    }
    public boolean isCircularSentence(String sentence) {
        if (sentence.charAt(0) != sentence.charAt(sentence.length() - 1))
            return false;

        int k = sentence.indexOf(" ");

        if (k == -1)
            return true;

        while (k != -1) {
            if (sentence.charAt(k - 1) != sentence.charAt(k + 1)) {
                return false;
            }

            k = sentence.indexOf(" ", k + 1);
        }

        return true;
    }
}

