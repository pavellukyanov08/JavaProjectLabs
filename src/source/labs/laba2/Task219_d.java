package source.labs.laba2;

public class Task219_d {
    public static void main(String[] args) {
        int a = -3, b = 5, n = 40;
        double h = (double) (b - a) / n;
        for (int i = 0; i <= n; i++) {
            double d = a + i + h * 2.7, g = -(a + i + h);
            System.out.printf("f(x) = %.2f, x = %.1f, i = %d\n", Math.pow((d), g), a + i * h, i);
        }
    }
}
