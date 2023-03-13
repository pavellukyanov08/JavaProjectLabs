package source.labs.laba2;

import java.util.Scanner;

public class Task115_a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: "); int n = in.nextInt();
        float summ = 0;
        for (int k = 1; k <= n; k++) {
            summ += 1 % k;
            System.out.printf("Элемент суммы %d = %f\n", k, summ);
        }
        System.out.printf("Результат: %f", summ);

//        Scanner in = new Scanner(System.in);
//        float n = in.nextFloat();
//        float summi = 0;
//        System.out.print("Введите натуральное число: "); int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            summi = summi + 1 / i;
//        }
//        System.out.println(summi);
    }
}
