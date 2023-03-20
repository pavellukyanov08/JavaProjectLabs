package source.labs.laba4;

import java.util.HashMap;
import java.util.Map;

public class Task9_177 {
    public static void main(String[] args) {
        String sentence = "Это предложение содержит два повторяющихся повторяющихся слова";
        String[] words = sentence.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            if (wordCount.get(word) == 2) {
                System.out.println("Повторяющиеся слова: " + word);
                break;
            }
        }
    }
}
