package source.labs.laba2;

import java.util.Scanner;

public class Task178_e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество членов: ");
        int n = scanner.nextInt();
        int i, k = 0;
        for (i = 1; i <= n; i++) {
            System.out.println("Введите последовательность: ");
            int a = scanner.nextInt();
            if ((i % 2 == 0) && (a % 2 == 1))
                k++;
        }
        System.out.println("Количество членов: " + k);
    }
}
