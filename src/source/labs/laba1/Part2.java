package source.labs.laba1;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String strOut = in.nextLine();

        System.out.print("Введите число byte ( от -127 до 127): ");
        byte byteOut = in.nextByte();

        System.out.print("Введите число short ( от -32768 до 32767): ");
        short shortOut = in.nextShort();

        System.out.print("Введите число int: ");
        int intOut = in.nextInt();

        System.out.print("Введите число long: ");
        long longOut = in.nextLong();

        System.out.print("Введите ПИ: ");

        double pi = in.nextDouble();

        System.out.print("Введите фразу: ");
        String phraseOut = in.next();

        System.out.printf("""
                ВЫВОД...
                Имя: %s;
                число byte: %d;
                число short: %d;
                число long: %d,
                число int: %d,
                число ПИ: %.5f \n""", strOut, byteOut, shortOut, intOut, longOut, pi);

        System.out.println("Фраза до первого пробела: " + phraseOut);

        in.close();
    }
}