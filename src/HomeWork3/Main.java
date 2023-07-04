package HomeWork3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[scanner.nextInt()];
        // Task 1
        for (int i = 0; i < array.length; i++) {
            array[i] =(int) (Math.random() * 100);
            System.out.println(array[i]);
        }
        System.out.println();

        // Task 2
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] * array[i];
                System.out.println(array[i]);
            }
        }
        System.out.println();

        // Task 3
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array[i]);
        }
    }
}
