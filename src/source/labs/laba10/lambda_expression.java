package source.labs.laba10;

import java.util.ArrayList;
import java.util.List;

public class lambda_expression {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Использование лямбда-выражения для вывода всех имен в списке
        System.out.println("Вывод всех имен в списке:");
        names.forEach(name -> System.out.println(name));

        // Использование лямбда-выражения для вывода всех имен, начинающихся на букву "A"
        System.out.println("\nВывод всех имен, начинающихся на букву 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));
    }
}
