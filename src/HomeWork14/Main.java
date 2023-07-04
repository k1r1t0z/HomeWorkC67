package HomeWork14;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        File file = new File("T:\\romeo-and-juliet.txt");
        try {
            FileReader fr = new FileReader(file);
            StringBuilder newLine = new StringBuilder();
            int i;
            while ((i = fr.read()) != -1) {
                newLine.append((char) i);
            }
            String[] maxStr = newLine.toString().split("[^A-z]");
            Arrays.sort(maxStr, Comparator.comparing(String::length));
            FileWriter fw = new FileWriter("T:\\MAX_STR.txt");
            fw.write(maxStr[maxStr.length - 1]);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
