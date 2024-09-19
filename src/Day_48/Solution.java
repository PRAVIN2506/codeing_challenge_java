package Day_48;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] result = solution.uncommonFromSentences(s1, s2);
        System.out.println("Uncommon words: " + Arrays.toString(result));
    }
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> wordFreq1 = new HashMap<>();
        Map<String, Integer> wordFreq2 = new HashMap<>();
        String sen1Words[] = s1.split(" ");
        String sen2Words[] = s2.split(" ");
        for(var word : sen1Words){
            wordFreq1.put(word, wordFreq1.getOrDefault(word, 0)+1);
        }
        for(var word : sen2Words){
            wordFreq2.put(word, wordFreq2.getOrDefault(word, 0)+1);
        }
        List<String> uncommons = new ArrayList<>();

        for(var entry : wordFreq1.entrySet()){
            String word = entry.getKey();
            int wordFreq = entry.getValue();
            if(wordFreq == 1 && !wordFreq2.containsKey(word)){
                uncommons.add(word);
            }
        }

        for(var entry : wordFreq2.entrySet()){
            String word = entry.getKey();
            int wordFreq = entry.getValue();
            if(wordFreq == 1 && !wordFreq1.containsKey(word)){
                uncommons.add(word);
            }
        }
        return uncommons.stream().toArray(String[]::new);
    }
}
