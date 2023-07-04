package HomeWork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + "\s");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += num;
                System.out.print(array[i][j] + "\s");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
               sum = sum + array[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
