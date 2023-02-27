package source.labs.laba2;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.Scanner;
public class  Task93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = in.nextInt();
        long[] x = new long[15];
        long q, r, b, d, c;
        q = in.nextInt();
        r = in.nextInt();
        b = in.nextInt();
        d = in.nextInt();
        c = in.nextInt();
        x[0] = c;
        x[1] = d;

        for (int i = 2; i <= n; i++) {
            x[i] = (q * x[i - 1] + r * x[i - 2] + b);
        }
        System.out.println("Ответ: " + Arrays.toString(x));
    }
}
