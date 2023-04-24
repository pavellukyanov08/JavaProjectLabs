package source.labs.laba5.task15_28;

import java.io.*;

public class Task15_28 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_28\\input.txt";
        String outputFile = "C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_28\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String convertedLine = line.replace('o', '\0').replace('l', 'o').replace('\0', 'l');
                writer.write(convertedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
