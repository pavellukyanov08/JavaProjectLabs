package source.labs.laba2;

import java.util.Scanner;

public class Task203 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int CC = 0;
        int[] Ci = new int[10];
        System.out.println("Количество покупателей в очереди: ");
        int n = in.nextInt();

        System.out.println("Время на обсулеживание одного покупателя: ");
        int ti = in.nextInt();

        for (int i = 1; i <= n; i++) {
            CC += ti;
            Ci[i] = CC;
            System.out.println(i + "-й покупатель провел в очереди " + Ci[i] + " минут");
        }

    }
}
