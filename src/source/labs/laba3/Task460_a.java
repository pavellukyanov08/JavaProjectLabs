package source.labs.laba3;

import java.util.Scanner;

public class Task460_a {
    public static int stringToInt(String s) throws NumberFormatException {
        boolean flag = false;
        int i = 0; int summ = 0;

        if (s.charAt(0) == '-') {
            flag = true;
            i = 1;
        }

        for (; i < s.length(); i++) {
            for (int j = 48; j < 58; j++) {
                char temp = (char)j;
                if (s.charAt(i) == temp) {
                    summ = summ * 10 + j - 48;
                }
            }
        }
        if (flag) return -summ; else return summ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите десятичное число в виде строки: ");
        String s = sc.nextLine();
        int a = stringToInt(s);
        System.out.println(a);
    }
}
