package source.labs.laba4;

public class Task9_159 {
    public static void main(String[] args) {
        String word1 = "processor";
        String word2 = "information";
        STS(word1.concat(word2));
    }

    private static void STS(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (CON(c[i], c) == 1) {
                System.out.print("" + c[i]);
            }
        }
    }

    private static int CON(char c, char[] c0) {
        int i = 0;
        for (int a = 0; a < c0.length; a++) {
            i += (int)c == (int)c0[a] ? 1 : 0;
        }
        return i;
    }
}

