package Day_58;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class AllOne {
    private Map<String, Integer> count;
    private TreeSet<Pair<Integer, String>> set;

    public AllOne() {
        count = new HashMap<>();
        set = new TreeSet<>((a, b) -> a.getKey().equals(b.getKey()) ? a.getValue().compareTo(b.getValue()) : a.getKey() - b.getKey());
    }

    public void inc(String key) {
        int n = count.getOrDefault(key, 0);
        count.put(key, n + 1);
        set.remove(new Pair<>(n, key));
        set.add(new Pair<>(n + 1, key));
    }

    public void dec(String key) {
        int n = count.get(key);
        set.remove(new Pair<>(n, key));
        if (n == 1) count.remove(key);
        else {
            count.put(key, n - 1);
            set.add(new Pair<>(n - 1, key));
        }
    }

    public String getMaxKey() {
        return set.isEmpty() ? "" : set.last().getValue();
    }

    public String getMinKey() {
        return set.isEmpty() ? "" : set.first().getValue();
    }
}

public class Solution {
    public static void main(String[] args) {
        AllOne allOne = new AllOne();

        allOne.inc("apple");
        allOne.inc("banana");
        allOne.inc("apple");
        allOne.dec("banana");
        allOne.inc("banana");

        System.out.println("Max Key: " + allOne.getMaxKey()); // should return "apple"
        System.out.println("Min Key: " + allOne.getMinKey()); // should return "banana"
    }
}
