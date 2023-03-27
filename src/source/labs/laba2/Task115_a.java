package source.labs.laba2;

import java.util.Scanner;

public class Task115_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: "); int n = in.nextInt();
        double summ = 0.0;
        for (int k = 1; k <= n; k++) {
            summ += (k % 2 == 0) ? -1 * (double) n / k : (double) n / k;
        }
        System.out.println("Сумма: " + summ);
        in.close();
    }
}
