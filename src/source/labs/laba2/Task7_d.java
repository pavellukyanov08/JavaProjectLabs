package source.labs.laba2;

import java.util.Scanner;

public class Task7_d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: "); int num = in.nextInt();
        float result = 0;
        for(int i = 0; i <= num; i++) {
            result = (float)(Math.sqrt(2 + num));
        }
        System.out.printf("Ответ: %f", result);
    }
}
