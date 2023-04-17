package source.labs.laba5.task15_12;

import java.io.*;

public class Task15_12 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_12\\input.txt";
        String outputFile = "C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task15_12" +
                "\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line = null;
            String prevLine = null;
            while ((line = reader.readLine()) != null) {
                if (prevLine != null) {
                    writer.write(prevLine);
                    writer.newLine();
                }
                prevLine = line;
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
