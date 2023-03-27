package source.labs.laba2;

import java.util.Scanner;

public class Task203 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, ti;
        System.out.println("Количество покупателей в очереди: ");
        N = in.nextInt();
        System.out.println("Время на обслуживание одного покупателя: ");
        ti = in.nextInt();
        int[] Ci = new int[N];

        int Cc = 0;
        for (int i = 1; i <= N; i++) {
            Cc += ti;
            Ci[i] = Cc;
            System.out.println(i + "-й покупатель провел в очереди " + Ci[i] + " минут");
        }
        in.close();
    }
}
