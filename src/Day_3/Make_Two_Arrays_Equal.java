package Day_3;

public class Make_Two_Arrays_Equal {
    public static void main(String[] args) {
        int []target = {1,2,3,4};
        int []arr = {2,4,1,3};
        int []a=new int [1001];
        for (int x : target) a[x]++;
        for (int x : arr) a[x]--;
        for (int x : a) {
            if (x != 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
