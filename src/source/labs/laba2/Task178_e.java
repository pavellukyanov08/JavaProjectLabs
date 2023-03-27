package source.labs.laba2;

import java.util.Scanner;

public class Task178_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите команду: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("Введите число элемента: ");
                int n = sc.nextInt();
                int numb = 0;
                for (int i = 0; i < n; i++) {
                    System.out.print("Введите число: ");
                    int num = sc.nextInt();
                    if (num % 2 != 0) {
                        numb;
                    }
                }
                System.out.println("Количество нечетных целых чисел:" + numb);
                break;
            case 2:
                System.out.println("Вы выбрали вариант 2");
                break;

            default:
                System.out.println("Неверный вариант");
                break;
        }
        sc.close();
    }
}
