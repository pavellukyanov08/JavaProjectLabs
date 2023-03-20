package source.labs.laba3;

public class Task431 {
    public static double h(double a, double b) {
        return a + b * b + b + a * a - Math.pow((a - b), 3);
    }
    public static void main(String[] args) {
        double s = 2.22; double t = 3.33;
        System.out.printf(String.valueOf(h(s,t) + Math.max(h((s - t), (s * t)), h((s - t), (s + t))) + h(1., 1.)));
    }
}
