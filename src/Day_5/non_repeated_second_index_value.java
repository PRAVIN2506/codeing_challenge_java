package Day_5;

import java.util.HashMap;
import java.util.Map;

public class non_repeated_second_index_value {
    public static void main(String[] args) {
        String[] arr ={"d","b","c","b","c","a"};
        int k = 2;
        Map<String, Integer> counter = new HashMap<>();
        for (String v : arr) {
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        for (String v : arr) {
            if (counter.get(v) == 1) {
                --k;
                if (k == 0) {
                    System.out.println(v);;
                }
            }
        }
        System.out.println("");;
    }
}
