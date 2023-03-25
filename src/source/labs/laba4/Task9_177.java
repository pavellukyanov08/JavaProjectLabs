package source.labs.laba4;

import java.util.HashMap;
import java.util.Map;

public class Task9_177 {
    public static void main(String[] args) {
        String sentence = "Это предложение содержит два повторяющихся повторяющихся слова";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}
