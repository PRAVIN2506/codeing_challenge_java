package Day_18;

public class Ugly_Number_II {
    public static void main(String[] args) {
        Ugly_Number_II u=new Ugly_Number_II();
        System.out.println(u.nthUglyNumber(10));
    }
    public int nthUglyNumber(int n) {
        int[] num = new int[1690];
        num[0] = 1;
        int ugly = 0, i2 = 0, i3 = 0, i5 = 0;

        for (int i = 1; i < 1690; i++) {
            num[i] = Math.min(Math.min(2 * num[i2], 3 * num[i3]), 5 * num[i5]);
            ugly = num[i];

            if (num[i2] * 2 == ugly)
                i2++;
            if (num[i3] * 3 == ugly)
                i3++;
            if (num[i5] * 5 == ugly)
                i5++;
        }

        return num[n - 1];
    }
}
