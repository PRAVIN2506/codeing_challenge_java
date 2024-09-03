package Day_34;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.getLucky("iiii",1));
    }
    public int getLucky(String s, int k) {
        StringBuilder number = new StringBuilder();
        for (char x : s.toCharArray()) {
            number.append(x - 'a' + 1);
        }

        while (k > 0) {
            int temp = 0;
            for (char x : number.toString().toCharArray()) {
                temp += x - '0';
            }
            number = new StringBuilder(String.valueOf(temp));
            k--;
        }
        return Integer.parseInt(number.toString());
    }
}
