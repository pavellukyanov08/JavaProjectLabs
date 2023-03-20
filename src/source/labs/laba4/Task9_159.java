package source.labs.laba4;

import java.util.*;

public class Task9_159 {
    public static void main(String[] args) {
        String word1 = "processor";
        String word2 = "information";
        String combinedWords = word1 + word2;

        Map<Character, Integer> letterCounts = new HashMap<>();

        // Count the number of occurrences of each letter
        for (int i = 0; i < combinedWords.length(); i++) {
            char c = combinedWords.charAt(i);
            if (letterCounts.containsKey(c)) {
                letterCounts.put(c, letterCounts.get(c) + 1);
            } else {
                letterCounts.put(c, 1);
            }
        }

        // Print the letters that occur only once
        for (char c : letterCounts.keySet()) {
            if (letterCounts.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
}

