package source.labs.laba5.task14_14;

import java.io.*;

public class Task14_14_part1 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task14_14\\file.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            for (int i = 0; i < 12; i++) {
                String line = reader.readLine();
                System.out.println(line);
            }

            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}