package source.labs.laba4;

import java.util.Scanner;

public class Task9_145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числа для суммирования: ");
        String text = sc.nextLine();

        int sum = 0;
        int startIndex = 0;
        int endIndex = 0;


        while (endIndex < text.length()) {
            startIndex = text.indexOf("+", endIndex) + 1;
            endIndex = text.indexOf("+", startIndex);

            if (endIndex == -1) {
                endIndex = text.length();
            }

            String numberStr = text.substring(startIndex, endIndex).trim();
            int number = Integer.parseInt(numberStr);
            sum += number;
        }
        System.out.println("Сумма чисел в строке: " + sum);
    }
}
