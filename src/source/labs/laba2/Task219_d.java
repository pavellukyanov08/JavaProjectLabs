package source.labs.laba2;

public class Task219_d {
    public static void main(String[] args) {
        double a = -1, b = 3;
        int n = 40;
        double h = (double) (b - a) / n;
        double xi, yi;
        System.out.println("x\t y");
        for (int i = 0; i <= n; i++) {
            xi = a + i * h;
            yi = xi * Math.exp(-xi);
            System.out.printf("%.2f,\t %.4f\n", xi, yi);
        }
    }
}
