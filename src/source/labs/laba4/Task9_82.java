package source.labs.laba4;

public class Task9_82 {
    public static void main(String[] args) {
        String sentence = "Disputationi arcu maecenas pretium ac alia adipisci solet lorem ne";
        int count = 0;
        int index = 0;

        sentence = sentence.trim();
        index = sentence.indexOf(" ");

        String firstword = sentence.substring(0, index);

        for (int i = 0; i < firstword.length(); i++) {
            if (firstword.charAt(i) == 'o') {
                count++;
            };
        }
        System.out.println("Количество букв 'o' в первом слове: " + count);
    }
}
