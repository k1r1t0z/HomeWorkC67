package HomeWork11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        Arrays.sort(array, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(array));
    }
}
