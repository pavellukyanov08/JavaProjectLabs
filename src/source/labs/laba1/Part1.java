package source.labs.laba1;

import java.text. *;
import java.util. *;

public class Part1 {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        String stringOut = "Hello world";

        char chrOut = 'H';

        int intOut = 20;

        double floatOut = 3.14159;

        int decOut = 25;

        f = new Formatter();
        for (double i = 1000; i < 1.0e+10; i *= 100) {

        f.format("%g ", i);

        System.out.println(f);

        }

        Date dateOut = new Date();

        // Decimal формат
        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        // Передаем значение и выводим
        String format = decimalFormat.format(123456789.123);
        System.out.println(format);

        System.out.printf("%s, %c, %d, %f, %o, %tA \n", stringOut, chrOut, intOut, floatOut, decOut, dateOut);

        Date currentDate = new Date();
        SimpleDateFormat dateFormat;

        // Вывод даты в формате день/месяц/год и текущее время
        dateFormat = new SimpleDateFormat();
        System.out.println("Constructor 1: " + dateFormat.format(currentDate));

        // Вывод в формате день и месяц словом
        dateFormat = new SimpleDateFormat("dd MMMM");
        System.out.println("Constructor 2: " + dateFormat.format(currentDate));

        // Вывод в формате день и месяц числом
        dateFormat = new SimpleDateFormat("dd MM", myDateFormatSymbols);
        System.out.println("Constructor 3: " + dateFormat.format(currentDate));

        // Вывод в формате день, месяц и год числом
        dateFormat = new SimpleDateFormat("dd MM yy", Locale.ENGLISH);
        System.out.println("Constructor 4: " + dateFormat.format(currentDate));
    }

    private static DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols(){

        // Объявляем наименования месяцев года словами
        public String[] getMonths() {
            return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"};
        }

    };
}