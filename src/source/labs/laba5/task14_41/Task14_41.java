package source.labs.laba5.task14_41;

import java.io.*;
public class Task14_41 {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task14_41\\input.txt";
        String outputFile = "C:\\Users\\lukja\\IdeaProjects\\JavaProjectLabs\\src\\source\\labs\\laba5\\task14_41" +
                "\\output.txt";
        int removeIndex = 4;

        try {
            FileInputStream inputStream = new FileInputStream(inputFile);
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            FileOutputStream outputStream = new FileOutputStream(outputFile);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            int count = 0;
            try {
                while (true) {
                    int number = dataInputStream.readInt();
                    count++;
                    if (count != removeIndex) {
                        dataOutputStream.writeInt(number);
                    }
                }
            } catch (EOFException e) {
                System.out.println("End of file");
            }

            dataInputStream.close();
            dataOutputStream.close();
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
