package source.labs.laba5.task15_24;

import java.io.*;

public class Task15_24_part2 {
    public static void main(String[] args) {
try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_24\\input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_24\\output.txt"))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
            String[] lines = sb.toString().split(System.lineSeparator());
            for (int i = lines.length - 1; i >= 0; i--) {
                writer.write(lines[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}