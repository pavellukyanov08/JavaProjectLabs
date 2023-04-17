package source.labs.laba5.task15_24;

import java.io.*;

public class Task15_24_part1 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_24\\input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_24\\output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
