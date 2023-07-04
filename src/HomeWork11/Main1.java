package HomeWork11;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextLine();
        }
        String minStr = array[0];
        String maxStr = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minStr.length()) {
                minStr = array[i];
            } else if (array[i].length() > maxStr.length()) {
                maxStr = array[i];
            }
        }
        System.out.println("Min str: " + minStr + "\n" + "Max str: " + maxStr);
    }
}
